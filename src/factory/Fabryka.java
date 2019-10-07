package factory;

import java.util.Scanner;

/**FACTORY - wzorzec projektowy
 * jest związany z polimorfizmem i z dziedziczeniem, pozwala w pewnym procesie decyzyjnym utworzyć właściwy typ
 * obiektu, który nas interesuje. */

public class Fabryka {

    public void fabryka() {

        Fabryka f = new Fabryka();

        System.out.print("Podaj markę: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String marka = f.dajSamochod(name).getMarka();
        String klasa = f.dajSamochod(name).getClass().getName();

        System.out.println(marka);
        System.out.println(klasa);
    }

    public Samochody dajSamochod(String marka) {
        Samochody samochody;

        if (marka.equals("fiat")) {
            samochody = new Fiat();
        } else if (marka.equals("ford")) {
            samochody = new Ford();
        } else if (marka.equals("mercedes")) {
            samochody = new Mercedes();
        } else {
            samochody = new Samochody();
        }
        return samochody;
    }
}
