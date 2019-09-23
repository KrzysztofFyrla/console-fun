package createCharacter;

import java.util.Scanner;

public class CharacterController{

    public void createCharacter() {
        Character character = new Character();
        Scanner scanner = new Scanner(System.in);

        int choice;
        int select;

        //tworzenie postaci
        System.out.println("*****KREATOR POSTACI*****");
        System.out.println("Witaj w kreatorze postaci");
        System.out.println("Czy chcesz rozpocząć tworzenie postaci?");
        System.out.println("1. TAK");
        System.out.println("2. NIE");

        select = scanner.nextInt();

        do {
            switch (select) {
                case 1:
                    System.out.println("Podaj imię swojej postaci");
                    character.name = scanner.nextLine();
                    character.name = scanner.nextLine();

                    System.out.println("Podaj kolor swojej postaci");
                    character.color = scanner.nextLine();

                    System.out.println("Podaj wiek swojej postaci");
                    character.age = scanner.nextInt();

                    System.out.println("Twoja postać ma na imię: " + character.name);
                    System.out.println(character.name + " ma kolor " + character.color + " i ma " + character.age + " lat.");
                    System.out.println("Dziękujemy za stworzenie postaci");
                break;
                default:
                    System.out.println("Dziękuję za skorzystanie z kreatora");
            }

            System.out.println("Czy chcesz powtórzyć tworzenie postaci?");
            System.out.println("1. TAK");
            System.out.println("2. NIE");

            choice = scanner.nextInt();
        }while(choice != 2);
    }
}
