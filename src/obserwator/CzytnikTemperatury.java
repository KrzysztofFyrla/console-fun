package obserwator;

//wyświetlacz z notatek
public class CzytnikTemperatury {

    private int nrKolejny;

    public CzytnikTemperatury(int nrKolejny) {
        this.nrKolejny = nrKolejny;
    }

    public void update(int temperatury) {
        System.out.println("Czytnik nr " + nrKolejny + " odczytał nową temperaturę: " + temperatury);
    }
}
