package zadanie2;

public class SteelAssemblyLine extends FurnitureAssemblyLine {

	Furniture fabricateFurniture(String item){
		
		if(item.equals("Chair")){
			return new SteelChair();
		}
		if(item.equals("Shelf")){
			return new SteelShelf();
		}
		if(item.equals("Table")){
			return new SteelTable();
		}else {
			System.out.println("The Glarp zone is for flarping and unflarping only!");
			return null;
		}

	}
}
