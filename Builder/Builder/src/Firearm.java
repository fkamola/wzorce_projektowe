import java.util.HashMap;
import java.util.Map;

public class Firearm {

	String firearm_type;
	
	Map<String, String> components = new HashMap<String, String>();
	
	public Firearm(String firearm_type){
		this.firearm_type = firearm_type;
	}
	
	public void finished_product() {
		System.out.print("\nFirearm Type: " + firearm_type + "\n");
		System.out.print("Barrel Type: " + components.get("barrel") + "\n");
		System.out.print("Magazine Type: " + components.get("magazine") + "\n");
		System.out.print("Stock Type: " + components.get("stock") + "\n");
		System.out.print("Sight Type: " + components.get("sight") + "\n");
		System.out.print("Trigger Type: " + components.get("trigger") + "\n");
    }
	
}
