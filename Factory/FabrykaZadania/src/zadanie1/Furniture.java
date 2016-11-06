package zadanie1;

abstract public class Furniture {
	
	String name;
	String material;
	Boolean warranty;
	
	public String getName(){
		return name;
	}
	
	public void fabricate(){
		System.out.println("Fabricating " + name);
	}
	
	public void assemble(){
		System.out.println("Assembling " + name);
	}
	
	public void pack(){
		System.out.println("Packaging " + name);
	}
	
	public void ship(){
		System.out.println("Shipped " + name);
	}
}
