package zadanie3;

public abstract class Furniture {
	
	String name;
	
	Material material;
	Finish finish;
	AssemblyMethod method;
	
	abstract void make();
	
	void fabricate(){
		System.out.println("Fabricating parts made out of: " + material);
	}
	
	void assemble(){
		System.out.println("Assembling...");
	}
	
	void polish(){
		System.out.println("Polishing to achieve " + finish + " finish...");
	}
	
	void pack(){
		System.out.println("Packaging...");
	}
	
	void ship(){
		System.out.println("Shipping...");
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
}
