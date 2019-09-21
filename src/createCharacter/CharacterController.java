package createCharacter;

import java.util.Scanner;
import createCharacter.Character;

public class CharacterController{

    public void createCharacter() {
        Character character = new Character();
        Scanner scanner = new Scanner(System.in);

        //tworzenie postaci
        System.out.println("Witaj w kreatorze postaci");
        System.out.println("Podaj imię swojej postaci");
        character.name = scanner.nextLine();
        System.out.println("Podaj kolor swojej postaci");
        character.color = scanner.nextLine();
        System.out.println("Podaj wiek swojej postaci");
        character.age = scanner.nextInt();

        System.out.println("Twoja postać ma na imię: " + character.name);
        System.out.println(character.name + " ma kolor " + character.color + " i ma " + character.age + " lat.");
        System.out.println("Dziękujemy za stworzenie postaci");
    }
}
