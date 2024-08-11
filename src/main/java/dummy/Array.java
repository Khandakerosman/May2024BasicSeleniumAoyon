package dummy;

public class Array {

	public static void main(String[] args) {
		Array array = new Array();
		array.countStudents();
	}

	
	public void countStudents() {
	//String studentsOne = "Aoyon";
	//String studentsTwo = "Meem";
	//String studentsThree = "Jeem";
	//Array	
	String [] students = {"Aoyon", "Meem", "Jeem", "Sky","ChiChi"};
	System.out.println(students);
	for (int i = 0; i <= students.length; i++) {
		System.out.println(students[i]);
	}

	
	System.out.println();
	for (int i = 0; i < students.length; i++) {
		if (students[i].equalsIgnoreCase("Sky")) {
			break;
		}
		
		System.out.println(students[i]);
	}
	
	}
	
}
