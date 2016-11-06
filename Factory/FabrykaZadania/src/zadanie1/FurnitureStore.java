package zadanie1;

public class FurnitureStore {
	SimpleFurnitureFactory factory;
	
	public FurnitureStore(SimpleFurnitureFactory factory) { 
		this.factory = factory;
	}
	
	public Furniture makeFurniture(String type){
		Furniture furniture;
		
		furniture = factory.fabricateFurniture(type);
		
		furniture.fabricate();
		furniture.assemble();
		furniture.pack();
		furniture.ship();
		
		return furniture;
	}
}
