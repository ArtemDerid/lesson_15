package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {

	Map<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();
	
	private static final ZooClub instance = new ZooClub();


	public static ZooClub getInstance() {
		return instance;
	}

	public ZooClub() {
		
	}
	
//	List<Animal> listOfAnimal = new ArrayList();
	

	public void addMember() {
		System.out.println("¬вед≥ть ≥м'€ нового учасника");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		System.out.println("¬вед≥ть в≥к учасника");
		scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		map.put(new Person(name, age), new ArrayList<>());

		System.out.println("¬и додали нового учасника до клубу\n" + map);
	}

	public void addAnimalToMember() {
		System.out.println("¬вед≥ть ≥м'€ учасника");
		Scanner scanner = new Scanner(System.in);
		String nameOfMemeber = scanner.next();

		System.out.println("¬вед≥ть тип тваринки");
		scanner = new Scanner(System.in);
		String type = scanner.next();

		System.out.println("¬вед≥ть ≥м'€ тваринки");
		scanner = new Scanner(System.in);
		String nameOfAnimal = scanner.next();

		for (Entry<Person, List<Animal>> entry : map.entrySet()) {
			if (entry.getKey().getName().equalsIgnoreCase(nameOfMemeber)) {
				List<Animal> value = entry.getValue();
				value.add(new Animal(type, nameOfAnimal));
				entry.setValue(value);
			}
		}

		System.out.println("¬ учасника " + nameOfMemeber + " тепер Ї тваринка " + type + " " + nameOfAnimal);
	}

	public void removeAnimalFromMember() {
		System.out.println("¬вед≥ть ≥м'€ учасника");
		Scanner scanner = new Scanner(System.in);
		String nameOfMemeber = scanner.next();

		System.out.println("¬вед≥ть ≥м'€ тваринки");
		scanner = new Scanner(System.in);
		String nameOfAnimal = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(nameOfMemeber)) {
				List<Animal> listOfAnimals = next.getValue();
				Iterator<Animal> iterator2 = listOfAnimals.iterator();
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					if (next2.getName().equalsIgnoreCase(nameOfAnimal)) {
						iterator2.remove();
					}
				}
			}
		}

		System.out.println("¬и видалили " + nameOfAnimal + " в учасника " + nameOfMemeber);
	}

	public void removeMember() {
		System.out.println("¬вед≥ть ≥м'€ учасника");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
			}
		}
		
		System.out.println("¬и видалили учасника клубу "+ name);
	}

	public void removeAnimalFromAllMembers() {
		System.out.println("¬вед≥ть ≥м'€ тваринки");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> listOfAnimals = next.getValue();
			Iterator<Animal> iterator2 = listOfAnimals.iterator();
			while (iterator2.hasNext()) {
				Animal next2 = iterator2.next();
				if (next2.getName().equalsIgnoreCase(name)) {
					iterator2.remove();
				}
			}

		}
		
		System.out.println("¬и видалили " + name + " в ус≥х учасник≥в");
	}

	public void showZooClub() {
		System.out.println(map);
	}
	
	public void exit() {
		System.out.println("¬и вийшли з програми");
		System.exit(0);
	}

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ZooClub other = (ZooClub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

}
