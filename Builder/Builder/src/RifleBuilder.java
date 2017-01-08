
public class RifleBuilder extends FirearmBuilder{
	
	public RifleBuilder(){
		firearm = new Firearm("Rifle");
	}
	
	@Override
	public FirearmBuilder build_magazine(){
		firearm.components.put("magazine", "5 rounds");
		return this;
	}

	@Override
	public FirearmBuilder build_stock() {
		firearm.components.put("stock", "long wooden stock");
		return this;
	}

	@Override
	public FirearmBuilder build_barrel() {
		firearm.components.put("barrel", "10 inch drilled barrel");
		return this;
	}

	@Override
	public FirearmBuilder build_sight() {
		firearm.components.put("sight", "scope");
		return this;
	}
}
