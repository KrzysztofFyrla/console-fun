package filmSimulator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FilmController {

    public void film(){

        Scanner scanner = new Scanner(System.in);
        Film film= new Film();

        List<Film> filmList = new ArrayList<>();

        int choice;
        int select;

        System.out.println("*****SYMULATOR DODAWANIA FILMÓW*****");

        do {
            System.out.println("Podaj tytuł filmu:");
            film.title = scanner.next();

            System.out.println("Podaj gatunek:");
            film.type = scanner.next();

            System.out.println("Podaj imię i nazwisko reżysera:");
            film.director = scanner.next();

            System.out.println("Podaj box office:");
            film.boxOffice = scanner.nextInt();

            System.out.println("1. Dodaj film");
            System.out.println("2. Wyjdź");
            choice = scanner.nextInt();
        } while(choice != 2);

        filmList.add(new Film(film.title, film.type, film.director, film.boxOffice));

        filmList.add(new Film("Hobbit", "Fantasy", "J. R. R. Tolkien", 4500000));
        filmList.add(new Film("Bad Boys", "Akcja", "George Gallo", 25023200));
        filmList.add(new Film("Chuck", "Akcja", "Josh Schwartz", 1500000));
        filmList.add(new Film("Zabójcza Broń", "Komedia Kryminalna", "Richard Donner", 45002030));

        for (Film lista: filmList){
            System.out.println(lista);
        }

        filmList.sort(Comparator.comparing(Film::getTitle));

        System.out.println("Lista posortowana:");
        for (Film lista: filmList){
            System.out.println(lista);
        }

        /*do {
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
        }*/
    }
}
