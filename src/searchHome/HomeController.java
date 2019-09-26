package searchHome;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HomeController {

    public void homeController() {

        System.out.println("*****Filtrowanie mieszkań*****");

        List<Home> homeList = Arrays.asList(
                new Home("Katowice", "Paniczki", "Ludmiły", 24.0f, 480000, 3),
                new Home("Katowice", "Mieszka I", "Konopnickiej", 48.0f, 560000, 5),
                new Home("Rybnik", "Pekin", "Sniadeckiego", 28.0f, 160000, 2),
                new Home("Częstochowa", "Tysiąclecia", "Jelonkowa", 38.0f, 168300, 3)
        );

        System.out.println("Pierwsza lista:");

        //pierwszy sposób filtrowania strumienia
        homeList.stream()
                .filter(home -> home.getCity().equals("Katowice")) //porownuje czy w liscie znajduje sie ta nazwa
                .filter(home -> home.getDistrict().equals("Paniczki"))
                .filter(home -> home.getPrice() > 300000)
                .filter(home -> home.getNumberRooms() > 1)
                .map(home -> home.getCity() + " " + home.getDistrict() + " " + home.getStreet() + " " + home.getSizeHome()
                        + " " + home.getPrice() + " " + home.getNumberRooms())
                .forEach(System.out::println);

        System.out.println("Druga lista:");

        //drugi sposób filtrowania srtumienia z wykorzystaniem predicate'a
        Predicate<Home> mNazwa = m -> m.getCity().equals("Katowice");

        List<Home> list = new ArrayList<>();

        list = homeList.stream()
                .filter(mNazwa)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
