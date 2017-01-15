import java.util.ArrayList;

public class StudentsPrototype implements Cloneable {
	
	private ArrayList<String> studentsList;
		
		public StudentsPrototype(){
			studentsList = new ArrayList<String>();
		}
		
		public StudentsPrototype(ArrayList<String> list){
			this.studentsList = list;
		}
		
		public void loadData(){
			studentsList.add("Stefan");
			studentsList.add("Waldek");
			studentsList.add("Szymon");
			studentsList.add("Teofil");
		}
		
		public ArrayList<String> getStudentsList() {
			return studentsList;
		}
	
		@Override
		public Object clone() throws CloneNotSupportedException{
				ArrayList<String> temp = new ArrayList<String>();
				
				for(String s : this.getStudentsList()){
					temp.add(s);
				}
				
				return new StudentsPrototype(temp);
		}	

}
