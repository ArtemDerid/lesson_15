package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1, щоб додати учасника клубу");
		System.out.println("Натисніть 2, щоб додати тваринку до учасника клубу");
		System.out.println("Натисніть 3, щоб видалити тваринку з учасника клубу");
		System.out.println("Натисніть 4, щоб видалити учасника клубу");
		System.out.println("Натисніть 5, щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Натисніть 6, щоб вивести на екран зооклуб");
		System.out.println("Натисніть 7, щоб вийти з програми");
	}

	public static void main(String[] args) {
		
		ZooClub zooClub = ZooClub.getInstance();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();
			switch (scanner.next()) {
			case "1": {
				zooClub.addMember();
			}

				break;

			case "2": {
				zooClub.addAnimalToMember();
			}
				break;

			case "3": {
				zooClub.removeAnimalFromMember();
			}
				break;

			case "4": {
				zooClub.removeMember();
			}
				break;

			case "5": {
				zooClub.removeAnimalFromAllMembers();
			}
				break;

			case "6": {
				zooClub.showZooClub();
			}
				break;

			case "7": {
				zooClub.exit();
			}
				break;

			}
		}

	}

}
