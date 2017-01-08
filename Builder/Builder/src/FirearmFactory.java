
public class FirearmFactory {

	public void assemble(FirearmBuilder firearmBuilder){
		
		firearmBuilder.build_trigger()
					  .build_magazine()
					  .build_barrel()
					  .build_sight()
					  .build_stock().get_firearm().finished_product();
	}
}
