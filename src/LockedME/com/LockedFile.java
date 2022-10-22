package LockedME.com;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;

// Creating a class for the Backend Process
public class LockedFile {
	
	static File fileName;;
	static String Path;
	// Creating method to check if the Main directory is available or not
	public static void fileCreation() {
		Path = System.getProperty("user.dir");
		fileName = new File(Path+ "/ Master");
		if(!fileName.exists()) {
			fileName.mkdirs();	
		}
	}
	//Backend process for user interactions starts here.
	public static void beginingOfProgram() throws IOException {
		// Calling "filecreation" method to check the directory is created or not
		fileCreation();
		// Calling a method from another class to display the process can done
		DisplayRecords.initialOperationRecords();
		Scanner sc=new Scanner (System.in);
		int userOpt=sc.nextInt();
		// Creating switch case to get the userOption to the process
		switch(userOpt) {
		case 1: filesinFolder();
				break;
		case 2: manageOperation();
				break;
		case 3: programEnds();
				break;
		default: System.out.println("Invalid option, Please enter the right option");
		}
		
	}
	//To end the program
	private static void programEnds() {
		System.out.println("Thank You");
		System.exit(0);
		
		
	}
	//To process the Main operations like add, delete, search & go back
	private static void manageOperation() throws IOException {
		fileCreation();
		DisplayRecords.displayOperationRecords();
		Scanner sc=new Scanner(System.in);
		int userOpt= sc.nextInt();
		switch(userOpt) {
		case 1: addFile();
				break;
		case 2: deleteFile();
				break;
		case 3: searchFile();
				break;
		case 4: beginingOfProgram();
				break;
		default:System.out.println("Invalid Option, Please enter the right one");
		}
		
	}
	//To search for file
	private static void searchFile() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name that to be removed/deleted from the directory\r\n"
				+ "\r\n"
				+ "?Please ensure that you're entering the Correct name ");
		String fileSearch = sc.nextLine();
		String[] list=fileName.list();
		for(String file:list) {
			if(fileSearch.equals(file)) {
				System.out.println(fileSearch+ " File Found");
				System.out.println(fileSearch+" is located in "+fileName.getAbsolutePath());
				System.out.println();
				manageOperation();
			}
			
		}System.out.println("File Not Found");
		System.out.println();
		manageOperation();
		
	}
	//To delete file from the directory
	private static void deleteFile() throws IOException {
		System.out.println("Enter the file name \r\n"
				+ "\r\n"
				+ "?Please ensure that you're entering the Correct name ");
		Scanner sc= new Scanner(System.in);
		String delFile=sc.nextLine();
		File file=new File(fileName+"/"+delFile);
		String[] list= fileName.list();
		for(String files: list) {
			if(delFile.equals(files)&&file.delete()){
				
				System.out.println("File "+delFile+" has Successfully deleted");
				System.out.println();
				manageOperation();
			}	
		}System.out.println("No file exist in the name ");
		System.out.println();
		manageOperation();
		
				
		
		
	}
	//To add files in the directory
	private static void addFile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name");
		Scanner sc = new Scanner(System.in);
		String fName= sc.nextLine();
		File file= new File(fileName+"/"+ fName);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File Created. \r\n"
					+ "Want to write something in the file(Yes/No)?");
			String useOpt=sc.nextLine();
			if(useOpt.equalsIgnoreCase("Yes")) {
				FileWriter Writer = new FileWriter(fileName+"/"+fName);
				System.out.println("\nInput content and press enter\n");
				String content = sc.nextLine();
				Writer.write(content);
				Writer.close();
				System.out.println("\nContent written to file " + fName);
				System.out.println("Content can be read using Notepad or Notepad++");
				System.out.println();
				manageOperation();
				}
			manageOperation();
		
		}else {
			System.out.println("NOTE - !File Name "+ fName +" already exist, Enter a new name");
			addFile();
		}
		
	}

	
	//To see the files in the directory
	private static void filesinFolder() throws IOException {
		if (fileName.list().length > 0) {
			String[] list= fileName.list();
			Arrays.sort(list);
			for(String files : list) {
				System.out.println("--- "+files);
				}
			System.out.println("Files are displayed");
			System.out.println();
			beginingOfProgram();
		}else {
			System.out.println("Directory is empty");
			System.out.println();
			beginingOfProgram();
			
		}
		
		
	}
}
