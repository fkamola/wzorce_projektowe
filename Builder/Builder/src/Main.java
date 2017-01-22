
public class Main {

	public static void main(String[] args) {
		FirearmFactory factory = new FirearmFactory();
		
		HandgunBuilder handgun = new HandgunBuilder();
		RifleBuilder rifle = new RifleBuilder();
		
		factory.assemble(handgun);
		factory.assemble(rifle);
		
	}
}
