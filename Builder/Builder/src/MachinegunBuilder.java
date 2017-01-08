
public class MachinegunBuilder extends FirearmBuilder {
	
	public MachinegunBuilder(){
		firearm = new Firearm("Machine Gun");
	}
	
	@Override
	public FirearmBuilder build_magazine(){
		firearm.components.put("magazine", "30 rounds clip");
		return this;
	}

	@Override
	public FirearmBuilder build_stock() {
		firearm.components.put("stock", "light tactical stock");
		return this;
	}

	@Override
	public FirearmBuilder build_barrel() {
		firearm.components.put("barrel", "10 inch drilled barrel");
		return this;
	}

	@Override
	public FirearmBuilder build_sight() {
		firearm.components.put("sight", "Collimator");
		return this;
	}
}
