package filmSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmController {

    public void film(){

        Scanner scanner = new Scanner(System.in);
        Film film = new Film();

        List<Film> filmList = new ArrayList<>();

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

            System.out.println(filmList);

            System.out.println("Menu");
            System.out.println("1. Dodaj kolejny film");
            System.out.println("2. Pokaż listę");
            choice = scanner.nextInt();
        } while(choice != 2);
    }
}
