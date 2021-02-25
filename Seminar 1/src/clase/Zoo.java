package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
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
	
	public void adaugaAnimal (Animal animal) {
		animale.add(animal);
	}
	
	public void feedAnimals() {
		for (Animal a: animale) {
			zookeeper.feed(a);
		}
	}
	
	
}
