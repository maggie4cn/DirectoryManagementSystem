package DirectoryManagementFactory;

import java.util.Scanner;

public class PersonnelDirectoryUI {

	 public static PersonnelDirectory PD = new PersonnelDirectory();
	 
	 public static void main(String[] args)
	 {
		 Scanner scan = new Scanner(System.in);
		 do {
			 displayMenu();
			 int choice = scan.nextInt();
			 switch (choice) {
			 case 1:
				 PD.addPersonel();
				 break;

			 case 2:
				 PD.findPersonel(); 
				 break;

			 case 3:
				 
				 PD.printNames();
				 break;

			 case 4:
				 PD.getNumberOfEntries();
				 break;
				 
			 default:
				   System.out.println("Invalid Input ");
			 }
		 }while (true);

	 }
	 
	 static void displayMenu() {
		 System.out.println("Welcome to the Personnel Directory Management System");
			System.out.println("====================================================");
			System.out.println("\n\n\t 1. Add Personel");
			System.out.println("\n\t 2. Find Personel");
			System.out.println("\n\t 3. Print Names");
			System.out.println("\n\t 4. Number of Entries in the Directory");
			System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");

	 }
}
