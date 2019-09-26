import abstraction.Figure;
import abstraction.Lambda;
import abstraction.Square;
import abstraction.Triangle;
import createCharacter.CharacterController;
import enumeratedType.Cars;
import file.FileOpen;
import file.FileSave;
import filmSimulator.FilmController;
import myThread.MyThread;
import searchHome.Home;
import searchHome.HomeController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CharacterController characterController = new CharacterController();
        FilmController filmController = new FilmController();
        FileSave fileSave = new FileSave();
        FileOpen fileOpen = new FileOpen();
        HomeController home = new HomeController();
        MyThread myThread = new MyThread();

        String name;
        String sourname;
        int age;
        int humor;
        int choice; //test
        int select;

        myThread.myThread();

        for(Cars cars : Cars.values()) {
            System.out.println(cars.getYear() + ", " +cars.getDoor());
        }

        /**Wywołanie lambdy z klasy interfejs -> Lambda
        Lambda addition = (a, b) -> a + b;
        System.out.println(addition.calculate(4, 4));*/

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

        //menu z dolnej klasy
        menu();

        select = scanner.nextInt();

        do {
            switch (select) {
                case 1:
                    characterController.createCharacter();
                    break;
                case 2:
                    filmController.film();
                    break;
                case 3:
                    try {
                        fileSave.fileSave();
                        System.out.println("Notatka została utworzona pomyślnie");
                    } catch (IOException e) {
                        System.out.println("Coś poszło nie tak");
                    }
                    break;
                case 4:
                    try {
                        fileOpen.fileOpen();
                    } catch (IOException e) {
                        System.out.println("Coś poszło nie tak");
                    }
                    break;
                case 5:
                    home.homeController();
                    break;
                case 6:
                    System.console();
                    break;
                default:
                    System.out.println("Przykro mi nie ma takiej opcji, proszę wybrać jeszcze raz");
            }
            menu();
            choice = scanner.nextInt();
        } while (choice != 6);
        System.out.println("Dziękuję za skorzystanie z programu, wróć jeszcze :)");
    }

    public static void menu() {
        System.out.println("*****MENU*****");
        System.out.println("1. Tworzenie postaci");
        System.out.println("2. Symulator dodawania filmów");
        System.out.println("3. Utwórz notatkę");
        System.out.println("4. Otwórz notatke");
        System.out.println("5. Filtrowanie mieszkań");
        System.out.println("6. Wyjście");
    }
}
