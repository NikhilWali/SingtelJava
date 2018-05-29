package questionE;

public class Butterfly extends Bird1{
	
	/*public String state;
	
	public String behaviour;
	
	public Butterfly(){
		
	}
	
	Butterfly(String state, String behaviour){
		this.state =state;
		this.behaviour =behaviour;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}*/
	
	public Butterfly(String name){
		super(name);
	}
	
	public Butterfly(){
		
	}
	
	public void fly() {
		System.out.println("A butterfly can fly");
	}

	@Override
	public String sound() {
		return "A butterfly does not make a sound";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	}

}
