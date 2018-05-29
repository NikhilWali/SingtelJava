package questionE;

public class Rooster1 extends Bird2 implements RoosterChickenInterface{
	
	public Rooster1() {
		super();
	}
	
	public Rooster1(String name) {
		super(name);
	}
	
	@Override 
	public String sound() { 
	      return "Cock-a-doodle-doo"; 
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	} 
}
