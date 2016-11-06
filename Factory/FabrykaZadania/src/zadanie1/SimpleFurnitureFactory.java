package zadanie1;

public class SimpleFurnitureFactory {

	public Furniture fabricateFurniture(String type){
		Furniture furniture = null;
		
		if(type.equals("Chair")){
			furniture = new Chair();
		} else if (type.equals("Table")){
			furniture = new Table();
		} else if (type.equals("Shelf")){
			furniture = new Shelf();
		}
		return furniture;
	}
	
	
	
	
}
