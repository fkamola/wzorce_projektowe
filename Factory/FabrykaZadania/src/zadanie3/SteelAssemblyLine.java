package zadanie3;

public class SteelAssemblyLine extends FurnitureAssemblyLine{

	protected Furniture fabricateFurniture(String item) {
		Furniture furniture = null;
		MakingProcessFactory makingProcess = new SteelMakingProcessFactory();
		
		if(item.equals("Chair")){
			furniture = new Chair(makingProcess);
			furniture.setName("Steel chair.");
		}
		
		if(item.equals("Table")){
			furniture = new Table(makingProcess);
			furniture.setName("Steel table.");
		}
		
		if(item.equals("Shelf")){
			furniture = new Shelf(makingProcess);
			furniture.setName("Steel shelf.");
		}
		
		return furniture;
	}
	
	

}
