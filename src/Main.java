import createCharacter.CharacterController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CharacterController characterController = new CharacterController();

        String name;
        String sourname;
        int age;
        int humor;
        int choice; //test
        int select;

        System.out.println("Witaj, podaj swoje imię: ");
        name = scanner.next();
        System.out.println("Podaj swoje nazwisko: ");
        sourname = scanner.next();

        System.out.println("Witaj " + name + " " + sourname);

        System.out.println("Podaj swój wiek: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(name + " jesteś osobą pełnoletnią");
        } else {
            System.out.println(name + " jesteś osobą niepełnoletnią");
        }

        do {
            System.out.println("Od 1 - 5 powiedz jak się dzisiaj miewasz :)");
            humor = scanner.nextInt();
            switch (humor) {
                case 1:
                    System.out.println("Dlaczego masz tak zły humor?");
                    break;
                case 2:
                    System.out.println("Coś się stało?");
                    break;
                case 3:
                    System.out.println("Mogę jakoś pomóc?");
                    break;
                case 4:
                    System.out.println("Mogło być lepiej :) ");
                    break;
                case 5:
                    System.out.println("Bardzo mnie to cieszy :) ");
                    break;
                default:
                    System.out.println("Wybrałeś złą opcję, proszę wybierz jeszcze raz");
            }

            System.out.println("Czy chcesz zmienić swoją decyzję?");
            System.out.println("1. Tak");
            System.out.println("2. Nie");
            choice = scanner.nextInt();
        } while (choice != 2);
        System.out.println("Dziękuję za wyrażenie Twojej opinii :)");

        //Tworzenie postaci
        System.out.println(name + " wybierz, co chcesz robić dalej:");
        System.out.println("*****MENU*****");
        System.out.println("1. Tworzenie postaci");

        select = scanner.nextInt();

        do {
            switch (select) {
                case 1:
                    characterController.createCharacter();
                    break;
                default:
                    System.out.println("Przykro mi nie ma takiej opcji, proszę wybrać jeszcze raz");
            }
            System.out.println("Czy chcesz powtórzyć tworzenie postaci?");
            System.out.println("1. TAK");
            System.out.println("2. NIE");
            choice = scanner.nextInt();
        } while (choice != 2);
        System.out.println("Dziękuję za skorzystanie z programu, wróć jeszcze :)");
    }
}
