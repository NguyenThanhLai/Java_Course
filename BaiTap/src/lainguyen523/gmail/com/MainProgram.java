package lainguyen523.gmail.com;

import java.util.ArrayList;

public class MainProgram {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Student> arrstudent = new ArrayList<>();
		Students st = new Students();
		arrstudent.add(new Student("SV001", "Nguyen Hai  A", 1998, true));
		arrstudent.add(new Student("SV002", "Nguyen Van  B", 1997, false));
		arrstudent.add(new Student("SV003", "Nguyen Thanh  C", 1998, true));
		arrstudent.add(new Student("SV004", "Nguyen Van  D", 1999, true));
		arrstudent.add(new Student("SV004", "Nguyen Van  D", 1999, true));
		
	}
}
