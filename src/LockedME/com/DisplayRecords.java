package LockedME.com;

public class DisplayRecords {

	public static void entryRecords(String Devep) {

		// Creating the application name and developer name
		System.out.println("*******************************************************\r\n"
				+ "\r\n"
				+ "-------Welcome to LockedMe----\r\n"
				+ "\r\n"
				+ "-------The application was developed by "+ Devep +" \r\n" 
				+ "\r\n"
				+ "********************************************************"
				+ "\r\n"
				+ "NOTE : ~You can Retrive the file's from the Origin Directory\r\n"
				+ "       ~You can Add, Delete, Search & go back previous\r\n"
				+ "\r\n");

	}
	
	public static void initialOperationRecords() {
		
		System.out.println("NOTE : Enter 1, 2 & 3 to begin the Operation\r\n"
				+"\r\n"
				+ "---->1. Retrieving the file names in an ascending order\r\n"
				+ "---->2. Manage Operations\r\n"
				+ "---->3. Close the application "); 
	}

	// Creating a method to display the Operations
	public static void displayOperationRecords() {

		// For user interactions
		System.out.println("1. Add file in the Directory\r\n" + "2. Delete file in the Directory\r\n"
				+ "3. Search the file in the Directory\r\n" + "4. Go back to Previous Option\r\n" + "");
	}


}
