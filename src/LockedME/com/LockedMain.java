package LockedME.com;

import java.io.IOException;
public class LockedMain {

	public static void main(String[] args) throws IOException {

		// Calling a method to display the application and the developer details
		DisplayRecords.entryRecords("Anish Augustin");
		
		//As it shows the application name and developer details, the program will directly start from this function
		LockedFile.beginingOfProgram();
		
	}

}
