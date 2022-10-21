package LockedME.com;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
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

	private static void manageOperation() {
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

	private static void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	private static void addFile() {
		// TODO Auto-generated method stub
		
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
