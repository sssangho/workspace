package sec03.exam02;

public class SoundableEx {
	
	private static void printSound(Soundable soundable) {  //매개변수 다형성
		System.out.println(soundable.sound());
	}
	
	private static void printDogSound(Dog dog) {
		System.out.println(dog.sound());
	}

	private static void printDogSound(Cat cat) {
		System.out.println(cat.sound());
	}

	public static void main(String[] args) {
		printDogSound(new Dog());
		printDogSound(new Cat());
		printSound(new Cat());
		printSound(new Dog());
	}
}
