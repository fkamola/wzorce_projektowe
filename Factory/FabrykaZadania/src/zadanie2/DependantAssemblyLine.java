package zadanie2;

public class DependantAssemblyLine {

	
	public Furniture fabricateFurniture(String material, String type){
		Furniture furniture = null;
		
		if(material.equals("ebony")){
			
			if(type.equals("Chair")){
				furniture = new EbonyChair();
			}
			if(type.equals("Shelf")){
				furniture = new EbonyShelf();
			}
			if(type.equals("Table")){
				furniture = new EbonyTable();
			}
			
		} else if (material.equals("steel")) {
			
			if(type.equals("Chair")){
				furniture = new SteelChair();
			}
			if(type.equals("Shelf")){
				furniture = new SteelShelf();
			}
			if(type.equals("Table")){
				furniture = new SteelTable();
			}
		} else {
			System.out.println("The Glarp zone is for flarping and unflarping only!");
			return null;
		}
		
		furniture.fabricate();
		furniture.assemble();
		furniture.pack();
		furniture.ship();
			
		return furniture;
	}
}
