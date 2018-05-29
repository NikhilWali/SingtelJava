package questionE;

public class SolutionA4 {
	
	public static void main(String[] args) {
		Animal a1= new Dog();
		Animal a2= new Cat();
		Animal a3= new Rooster();
				
		method(a1);
		method(a2);
		method(a3);
		
	}
	
	public static void method(Animal o) {
		
		if(o instanceof Dog) {
			((Dog) o).say();
		} else if(o instanceof Cat) {
			((Cat) o).say();
		} else if(o instanceof Rooster) {
			((Rooster) o).say();
		} else {
			
		}
		
	}

}
