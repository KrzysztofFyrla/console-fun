package filmSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmController {

    public void film(){

        Scanner scanner = new Scanner(System.in);
        Film film = new Film();

        List<String> filmList = new ArrayList<>();
        List<Integer> filmListInt = new ArrayList<>();

        int choice;

        do {
            System.out.println("Witaj w kreatorze dodawnia filmów.");
            System.out.println("Podaj tytuł:");
            film.title = scanner.nextLine();

            System.out.println("Podaj gatunek:");
            film.type = scanner.nextLine();

            System.out.println("Podaj imię i nazwisko reżysera:");
            film.director = scanner.nextLine();

            System.out.println("Podaj budżet filmu:");
            film.boxOffice = scanner.nextInt();

            System.out.println("Menu");
            System.out.println("1. Dodaj kolejny film");
            System.out.println("2. Pokaż listę");
            choice = scanner.nextInt();
        } while(choice != 2);

        filmList.add(film.title);
        filmList.add(film.type);
        filmList.add(film.director);
        filmListInt.add(film.boxOffice);

        for (String s : filmList){
            System.out.println("Tytuł: " + s);
            for (Integer i : filmListInt) {
                System.out.println("Box office: " + i);
            }
        }
    }
}
