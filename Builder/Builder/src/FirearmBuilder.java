
public abstract class FirearmBuilder {
	protected Firearm firearm;
	
	public Firearm get_firearm(){
		return firearm;
	}
	
	public FirearmBuilder build_trigger(){
		firearm.components.put("trigger", "default trigger");
		return this;
	}
	
	public abstract FirearmBuilder build_stock();
	public abstract FirearmBuilder build_magazine();
	public abstract FirearmBuilder build_barrel();
	public abstract FirearmBuilder build_sight();
	
}
