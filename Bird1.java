package questionE;

public abstract class Bird1 {
	
	public String birdName;
	
	public Bird1(String birdName) { 
		this.birdName = birdName; 
	} 

	
	public Bird1() {
	}

	public String fly(String wingcut) {
		String s= null;
		if(wingcut!= null && wingcut=="YES") {
			s="A " + birdName + " cannot fly";
		}else {
			s="A " + birdName + " can fly";
		}
		
		return s;
	}
		
	 public String speak() { 
	     return "A " + birdName + " says:" + sound(); 
	 } 
	 public abstract String sound();
	 
	 public abstract String swim();
	 
	 public String move() {
		return "A " + birdName + " can " + swim();
		 
	 }
	 
	 
	 

}
