package zadanie3;

public abstract class FurnitureAssemblyLine {
	
	protected abstract Furniture fabricateFurniture(String item);
	
	public Furniture orderFurniture(String type){
		Furniture furniture = fabricateFurniture(type);
		
		furniture.make();
		furniture.fabricate();
		furniture.assemble();
		furniture.polish();
		furniture.pack();
		furniture.ship();
		
		return furniture;
	}
}
