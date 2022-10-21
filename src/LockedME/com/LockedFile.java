package LockedME.com;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class LockedFile {
	
	static File fileName;

	public static void fileCreation() {
		String Path = System.getProperty("user.dir");
		fileName = new File(Path+ "/ Master");
		if(!fileName.exists()) {
			fileName.mkdirs();
			
		}
	}
	
	public static void beginingOfProgram() {
		
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
		}
		
	}

	private static void programEnds() {
		// TODO Auto-generated method stub
		
		
	}

	private static void manageOperation() throws IOException {
		// TODO Auto-generated method stub
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
		case 4: goBack();
				break;
		default:System.out.println("Invalid Option, Please enter the right one");
		}
		
	}

	private static void goBack() {
		// TODO Auto-generated method stub
		
	}

	private static void searchFile() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteFile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the File Name to be deleted ");
		Scanner sc= new Scanner(System.in);
		String delFile=sc.next();
		String[] list= fileName.list();
		for(String file:list) {
			if(delFile.equals(file)) {
				fileName.delete();
				System.out.println("File "+delFile+" has Successfully deleted");
			}else {
				System.out.println(" File Not Found, Please enter the right spelling");
				manageOperation();
			}
				
		}
		
	}

	private static void addFile() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name");
		Scanner sc = new Scanner(System.in);
		String fName= sc.next();
		File file= new File(fileName+"/"+ fName);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File Creted");
		}else {
			System.out.println("NOTE - !File Name "+ fName +"already exist, Enter a new name");
			addFile();
		}
		
	}

	private static void filesinFolder() {
		// TODO Auto-generated method stub
		String[] list= fileName.list();
		for(String files : list) {
			Arrays.sort(list);
			System.out.println(files);
		}
		
	}
}
