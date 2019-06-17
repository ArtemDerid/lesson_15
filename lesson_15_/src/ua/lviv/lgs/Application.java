package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("�������� 1, ��� ������ �������� �����");
		System.out.println("�������� 2, ��� ������ �������� �� �������� �����");
		System.out.println("�������� 3, ��� �������� �������� � �������� �����");
		System.out.println("�������� 4, ��� �������� �������� �����");
		System.out.println("�������� 5, ��� �������� ��������� �������� � ��� ��������");
		System.out.println("�������� 6, ��� ������� �� ����� �������");
		System.out.println("�������� 7, ��� ����� � ��������");
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
