package questionE;

public class Cat extends Animal implements Parrot{

	@Override
	public void say() {
		System.out.println("A parrot living with cats says: “Meow”");		
	}

}
