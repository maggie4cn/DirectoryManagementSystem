package DirectoryManagementFactory;

import java.util.ArrayList;
import java.util.Scanner;


public class PersonnelDirectory {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		totalObjects total = new totalObjects();
			
		
		public  void addPersonel() {
			String firstN, lastN, middleN;
			int empID;
			double salary;
			
			System.out.println("Enter first name: ");
			firstN = scan.nextLine();
			System.out.println("Enter last name: ");
			lastN = scan.nextLine();
			System.out.println("Enter middle name: ");
			middleN = scan.nextLine();

			System.out.println("Enter empploy id : ");
			empID = scan.nextInt();
			System.out.println("Enter base salaey");
			salary = scan.nextDouble();
			scan.nextLine();

			Person p = PersonnelFactory.createPersonnel("EP",lastN, firstN, middleN, empID, salary);
			personList.add(p);
			total.objectAdded();

		}
		
		public void findPersonel() {
			String firstN, lastN;
			
			System.out.println("Enter firts name : ");
			firstN = scan.nextLine();

			System.out.println("Enter last name : ");
			lastN = scan.nextLine();

			boolean found = false;
			int loc = -1;

			for (int i = 0; i < personList.size(); i++) {
				if (personList.get(i).first.equals(firstN) && personList.get(i).last.equals(lastN)) 
				{
					found = true;
					loc = i;
				}
			}

			if (found) {
				System.out.println("Found");
				System.out.println(personList.get(loc).first + "  " + personList.get(loc).middle 
						+ "  " + personList.get(loc).last);
				
			} else {
				System.out.println("not found");
				Person p1 = PersonnelFactory.createPersonnel("P",lastN, firstN, " ",0,0);
				personList.add(p1);
				total.objectAdded();
			}
		}

	public void printNames() {
		String last;
		String first;
		String middle;

		System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
		int order = scan.nextInt();
		for (int i = 0; i < personList.size(); i++) {
			last = personList.get(i).last;
			first = personList.get(i).first;
			middle = personList.get(i).middle;
			if (order == 0) {
				System.out.println(first + "  " + middle + "  " + last);
			} else if (order == 1) {

				System.out.println(last + " ," + middle + " " + first);

			} else if (order == 2) {

				System.out.println(last + " ," + first + " " + middle);

			}
		}

	}
		
		public void getNumberOfEntries() {
			System.out.println("Total Entries : " + total.getTotalObjects());

		}


}