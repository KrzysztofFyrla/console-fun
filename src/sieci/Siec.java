package sieci;

import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Siec {

    public void siec() throws Exception{

        /**Odczytywanie adresów na pomocą InerAdress*/

        /*//odczytanie własnego hosta
        InetAddress adres = InetAddress.getLocalHost();
        System.out.println(adres);

        //odczytanie hosta o konkretnej nazwie
        adres = InetAddress.getByName("krzysztoffyrla.pl");
        System.out.println(adres);

        //odczytanie wszystkich adresów o konkretnej nazwie
        InetAddress adresy[] = InetAddress.getAllByName("krzysztoffyrla.pl");
        for (int x = 0; x < adresy.length; x++) {
            System.out.println(adresy[x]);*/

        /**Użycie URL*/
        /*URL url = new URL("http://krzysztoffyrla.pl/solidarnosc.html");

        System.out.println("Protokół: " + url.getProtocol());
        System.out.println("Komputer: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Plik: " + url.getFile());
        System.out.println("Całość: " + url.toExternalForm());*/

        /**Użycie URLConnection*/

        URL url = new URL("http://krzysztoffyrla.pl");

        //otwiera połączenie nie do strony, ale do serwera
        URLConnection urlConnection = url.openConnection();

        long data = urlConnection.getDate();
        System.out.println(new Date(data));

        //format kodowania
        System.out.println(urlConnection.getContentType());

        data = urlConnection.getExpiration();
        System.out.println(new Date(data));

        data = urlConnection.getLastModified();
        System.out.println(new Date(data));
    }
}
