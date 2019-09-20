import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        String sourname;
        int age;
        int humor;
        int choice; //test

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
    }
}
