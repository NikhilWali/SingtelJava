package questionE;

public class Chicken1 extends Bird2 implements RoosterChickenInterface {
	
	public Chicken1() {
		super();
	}
	
	public Chicken1(String name) {
		super(name);
	}
	
	@Override 
	public String sound() { 
	      return "Cluck, cluck"; 
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	} 
	
}
