package interator;

import java.util.*;

/**Iterator potrafi sam sprawdzic kiedy osiagnal koniec koleckcji, sluzy do tego metoda hasNext, ktora zwraca
 * true/false.
 * Iterator działa praktycznie tak samo jak pętla forech, jednak ona iteruje do przodu a iterator może do tyłu.
 * Dla tego iteratora nie musimy pdoawać typu jakim jest lista, a forech potrzebuje.
 *
 * SET:
 * Set nie jest listą dlatego możemy iterować tylko w przód, nie jest czymś co jest indeksowane
 *
 * MAPA:
 * Przy iteracji map musimy podać typ po jakim będziemy iterować, w tym przypadku będzie to klucz, ponieważ jest to
 * wygodniejsze.*/

public class Iteracja {

    public void interacja() {

        List<String> listaStr = new ArrayList<>();
        listaStr.add("jeden");
        listaStr.add("dwa");
        listaStr.add("trzy");
        listaStr.add("cztery");

        List<Integer> listaInt = new ArrayList<>();
        listaInt.add(100);
        listaInt.add(200);
        listaInt.add(300);
        listaInt.add(400);

        Set<String> kolSet = new HashSet<>();
        kolSet.add("str 1");
        kolSet.add("str 2");
        kolSet.add("str 3");
        kolSet.add("str 4");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        map.put(4, "cztery");

        for (String s : listaStr){
            System.out.println(s);
        }

        System.out.println("\n ====== List String - w przód ======");

        Iterator i = listaStr.listIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("\n ====== List String - w tył ======");
        while (((ListIterator) i).hasPrevious()){
            System.out.println(((ListIterator) i).previous());
        }

        //iterowanie z pomocą indexów
        System.out.println("\n ====== Iterowanie z indexami - w przód ======");
        while (i.hasNext()) {
            System.out.println(((ListIterator) i).nextIndex() + " : " + i.next());
        }

        System.out.println("\n ====== Iterowanie z indexami - w tył ======");
        while (((ListIterator) i).hasPrevious()) {
            System.out.println(((ListIterator) i).previousIndex() + " : " + ((ListIterator) i).previous());
        }

        //Iterowanie set
        System.out.println("\n ====== Iterowanie SET ======");
        Iterator s = kolSet.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }

        //Iterowanie map
        System.out.println("\n ====== Iterowanie MAP ======");
        Iterator<Integer> m = map.keySet().iterator();
        while (m.hasNext()) {
            Integer key = m.next();
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println("\n");
    }
}
