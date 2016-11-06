package zadanie3;

public class EbonyAssemblyLine extends FurnitureAssemblyLine{

	protected Furniture fabricateFurniture(String item) {
		Furniture furniture = null;
		MakingProcessFactory makingProcess = new EbonyMakingProcessFactory();
		
		if(item.equals("Chair")){
			furniture = new Chair(makingProcess);
			furniture.setName("Ebony chair.");
		}
		
		if(item.equals("Table")){
			furniture = new Table(makingProcess);
			furniture.setName("Ebony table.");
		}
		
		if(item.equals("Shelf")){
			furniture = new Shelf(makingProcess);
			furniture.setName("Ebony shelf.");
		}
		
		return furniture;
	}
	
	

}
