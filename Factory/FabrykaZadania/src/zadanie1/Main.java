package zadanie1;

public class Main {

	public static void main(String[] args) {
		SimpleFurnitureFactory factory = new SimpleFurnitureFactory();
		FurnitureStore store = new FurnitureStore(factory);
		
		Furniture furniture = store.makeFurniture("Chair");
		System.out.println("Finished production of: " + furniture.getName());
		
		furniture = store.makeFurniture("Table");
		System.out.println("Finished production of: " + furniture.getName());
	}
}
