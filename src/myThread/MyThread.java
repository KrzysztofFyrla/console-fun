package myThread;

class NewThread implements Runnable {

    private String name;
    Thread t; /*referencja zmiennej typu thread, dzięki której będziemy tworzyć nowy obiekt typu thread, czyli
    będzie tworzony nowy wątek*/

    //nowy wątek tworzony jest w kontruktorze, gdzie nie trzeba dopisywać  modyfikatora


    NewThread(String nameTwo) {
        this.name = nameTwo;

        t = new Thread(this, nameTwo); /*tworzenie nowego wątku, this informuje go, że natychmiast po jego
        utworzeniu sterowanie ma zostać przekazane do metody run, czyli po utworzeniu ma się od razu uruchomić*/

        t.start(); //uruchomienie -> nie trzeba nic pisać w metodzie run
    }

    @Override
    public void run() {
        System.out.println("Uruchomiono wątek potomny " + name);

        //uśpienie wątku
        try {
            System.out.println("Wątek potomny " + name + " uśpiony.");
            Thread.sleep(2000);
            System.out.println("Wątek potomny " + name + " wznowiony.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono działanie wątku potomnego " + name);
    }
}

public class MyThread {

    public static void myThread() {

        //uruchomienie wątków, niczego nie musimy zmieniać w klasie newThread, wystarczy dopisywać nowe obiekty
        new NewThread("JEDEN");

        //poniżej znajduje się całkowicie inny wątek -> główny
        try {
            System.out.println("Usypiam wątek główny");
            Thread.sleep(4000);
            System.out.println("Wznawiam wątek główny");
        } catch (InterruptedException e) {
            System.out.println("Przerwano wątek główny");
        }
        System.out.println("Zakończono wykonywanie wątku głównego");
    }
}
