package LockedME.com;

// This class will be shown in the output
public class DisplayRecords {

	public static void entryRecords(String Devep) {

		// Creating the application name and developer name
		// In the NOTE point, the user get to know what all things can do in this application
		System.out.println("************************************************************\r\n"
				+ "\r\n"
				+ "-------Welcome to LockedMe----\r\n"
				+ "\r\n"
				+ "-------This application was developed by "+ Devep +" \r\n" 
				+ "\r\n"
				+ "*************************************************************"
				+ "\r\n"
				+ "NOTE : ~You can Retrive the file's from the Master Directory\r\n"
				+ "       ~You can Add, Delete, Search & go back previous\r\n"
				+ "\r\n");

	}
	// Creating method for the user idea, what to do first
	public static void initialOperationRecords() {
		//This is is the beginning of the Process
		//The user have to click either 1 or 2 or 3 to do the functions
		System.out.println("********** Select your option and press the ENTER key ********\r\n"
				+"\r\n"
				+ "---->1. Retrieving the file names in an ascending order\r\n"
				+ "---->2. Manage Operations\r\n"
				+ "---->3. Close the application "); 
	}

	// Creating a method to display the Operations
	public static void displayOperationRecords() {

		// For user interactions
		System.out.println("1. Add file in the Master Directory\r\n" + "2. Delete file From the Master Directory\r\n"
				+ "3. Search the file in the Master Directory\r\n" + "4. Go back to Previous Option\r\n" + "");
	}


}
