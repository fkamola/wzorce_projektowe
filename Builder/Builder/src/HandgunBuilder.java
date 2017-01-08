
public class HandgunBuilder extends FirearmBuilder {

	public HandgunBuilder(){
		firearm = new Firearm("Handgun");
	}
	
	@Override
	public FirearmBuilder build_magazine(){
		firearm.components.put("magazine", "11 rounds mag");
		return this;
	}

	@Override
	public FirearmBuilder build_stock() {
		firearm.components.put("stock", "handgun grip");
		return this;
	}

	@Override
	public FirearmBuilder build_barrel() {
		firearm.components.put("barrel", "7 inch");
		return this;
	}

	@Override
	public FirearmBuilder build_sight() {
		firearm.components.put("sight", "muzzle sight");
		return this;
	}
}
