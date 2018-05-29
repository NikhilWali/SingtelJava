package questionE;

public class Duck extends Bird1 {
	Duck(){
		super();
	}
	public Duck(String name) { 
		super(name); 
	}
	
	
	@Override 
	public String sound() { 
	      return "Quack, quack"; 
	}
	@Override
	public String swim() {
		return "swim";
	} 

}
