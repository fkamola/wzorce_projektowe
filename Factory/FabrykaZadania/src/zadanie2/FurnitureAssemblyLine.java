package zadanie2;

public abstract class FurnitureAssemblyLine {
		
	abstract Furniture fabricateFurniture(String item);
	
	public Furniture makeFurniture(String type){
		Furniture furniture;
		
		furniture = fabricateFurniture(type);
		
		furniture.fabricate();
		furniture.assemble();
		furniture.pack();
		furniture.ship();
		
		return furniture;
	}
}
