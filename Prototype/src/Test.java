import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		StudentsPrototype students = new StudentsPrototype();
		students.loadData();
		
		StudentsPrototype studentsNew = (StudentsPrototype) students.clone();
		
		StudentsPrototype studentsNew1 = (StudentsPrototype) students.clone();
		
		ArrayList<String> list = studentsNew.getStudentsList();
		list.add("Krystyna");
		
		ArrayList<String> list1 = studentsNew1.getStudentsList();
		list1.remove("Stefan");
		
		System.out.println("original List: " + students.getStudentsList());
		System.out.println("first cloned List: " + list);
		System.out.println("second cloned List: " + list1);
	}
}
