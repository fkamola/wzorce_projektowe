package zadanie2;

public class EbonyAssemblyLine extends FurnitureAssemblyLine {

	Furniture fabricateFurniture(String item){
		
		if(item.equals("Chair")){
			return new EbonyChair();
		}
		if(item.equals("Shelf")){
			return new EbonyShelf();
		}
		if(item.equals("Table")){
			return new EbonyTable();
		}else {
			System.out.println("The Glarp zone is for flarping and unflarping only!");
			return null;
		}
	}
}
