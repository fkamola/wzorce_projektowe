package zadanie2;

public class Main {

	public static void main(String[] args) {
		FurnitureAssemblyLine ebony = new EbonyAssemblyLine();
		FurnitureAssemblyLine steel = new SteelAssemblyLine();
		DependantAssemblyLine dep = new DependantAssemblyLine();
		
		ebony.makeFurniture("Chair");
		
		steel.makeFurniture("Table");
		
		ebony.makeFurniture("Shelf");
		
		dep.fabricateFurniture("ebony", "Chair");
		
	}
}
