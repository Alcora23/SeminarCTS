package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
	private Zookeeper zookeeper;
	private List<Animal> animale;
	
	public Zoo() {
		animale = new ArrayList<>();
		zookeeper = new Zookeeper("Ion");
	}

	public Zoo(Zookeeper zookeeper, List<Animal> animale) {
		super();
		this.zookeeper = zookeeper;
		this.animale = animale;
	}
	
	public void addAnimal (Animal animal) {
		animale.add(animal);
	}
	
	public void feedAllAnimals() {
		for (Animal a: animale) {
			zookeeper.feed(a);
		}
	}
	
	
}
