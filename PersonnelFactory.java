package DirectoryManagementFactory;

public class PersonnelFactory {

		public static Person createPersonnel(String type, String last,String first, String middle,int id, double sal) {
			switch (type) {
				case("EP"):
					return new Employee(last, first, middle, id, sal);
			    case("P"):
			    	return new Person(last, first, middle);
				case("EC"):
					return new Executives(last,first,middle);

				case("S"):
					return new Security(last,first,middle);

				case("V"):
					return new Volunteers(last,first,middle);
				default:
					return null;
			}
		}
}
