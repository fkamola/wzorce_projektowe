package zadanie2;

public class Main {

	public static void main(String[] args) {
		FurnitureAssemblyLine ebony = new EbonyAssemblyLine();
		FurnitureAssemblyLine steel = new SteelAssemblyLine();
		DependantAssemblyLine dep = new DependantAssemblyLine();
		
		Furniture furniture = ebony.makeFurniture("Chair");
		
		furniture = steel.makeFurniture("Table");
		
		furniture = ebony.makeFurniture("Shelf");
		
		furniture = dep.fabricateFurniture("ebony", "Chair");
		
		
	}

}
