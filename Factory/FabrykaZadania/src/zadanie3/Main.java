package zadanie3;

public class Main {

	public static void main(String[] args) {
		FurnitureAssemblyLine ebonyLine = new EbonyAssemblyLine();
		FurnitureAssemblyLine steelLine = new SteelAssemblyLine();
		
		Furniture furniture = ebonyLine.orderFurniture("Table");
		
		furniture = steelLine.orderFurniture("Shelf");
		
		furniture = steelLine.orderFurniture("Table");
	}
}
