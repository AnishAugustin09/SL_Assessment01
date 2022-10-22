package LockedME.com;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class LockedFile {
	
	static File fileName;;
	static String Path;

	public static void fileCreation() {
		Path = System.getProperty("user.dir");
		fileName = new File(Path+ "/ Master");
		if(!fileName.exists()) {
			fileName.mkdirs();	
		}
	}
	
	public static void beginingOfProgram() throws IOException {
		
		fileCreation();
		
		DisplayRecords.initialOperationRecords();
		Scanner sc=new Scanner (System.in);
		int userOpt=sc.nextInt();
		
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

	private static void programEnds() {
		// TODO Auto-generated method stub
		System.out.println("Thank You");
		System.exit(0);
		
		
	}

	private static void manageOperation() throws IOException {
		// TODO Auto-generated method stub
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

	private static void searchFile() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the File Name");
		String fileSearch = sc.nextLine();
		String[] list=fileName.list();
		for(String file:list) {
			if(fileSearch.equals(file)) {
				System.out.println(fileSearch);
				System.out.println("File Found");
				System.out.println();
				manageOperation();
			}else {
				System.out.println("No Such file in the directory, Please check the spelling before you enter");
				manageOperation();
			}
		}
		
	}

	private static void deleteFile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the File Name to be deleted ");
		Scanner sc= new Scanner(System.in);
		String delFile=sc.nextLine();
		File file=new File(fileName+"/"+delFile);
		String[] list= fileName.list();
		for(String files: list) {
			if(delFile.equals(files)&&file.delete()){
				
				System.out.println("File "+delFile+" has Successfully deleted");
				System.out.println();
				manageOperation();
			}else {
				System.out.println("File Not Found, Please enter the right spelling");
				manageOperation();
			}	
		}
		
				
		
		
	}

	private static void addFile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name");
		Scanner sc = new Scanner(System.in);
		String fName= sc.nextLine();
		File file= new File(fileName+"/"+ fName);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File Created");
			manageOperation();
		}else {
			System.out.println("NOTE - !File Name "+ fName +"already exist, Enter a new name");
			addFile();
		}
		
	}

	private static void filesinFolder() throws IOException {
		// TODO Auto-generated method stub
		if (fileName.list().length > 0) {
			String[] list= fileName.list();
			Arrays.sort(list);
			for(String files : list) {
				System.out.println(files);
				}
			System.out.println("Files are displayed");
			beginingOfProgram();
		}else {
			System.out.println("Directory is empty");
			beginingOfProgram();
			
		}
		
		
	}
}
