package questionE;

public class Chicken extends Bird1 implements RoosterChickenInterface {
	
	public Chicken() {
		super();
	}
	
	public Chicken(String name) {
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
