
public class BattleFishingBoat implements BattleShip{
	
	  private FishingBoat boat;

	  public BattleFishingBoat() {
	    boat = new FishingBoat();
	  }

	  @Override
	  public void fire() {
	    System.out.println("Fire!");
	  }

	  @Override
	  public void move() {
	    boat.sail();
	  }
}
