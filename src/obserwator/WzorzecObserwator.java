package obserwator;

public class WzorzecObserwator {

    public void obserwator() {

        StacjaPogodowa sp = new StacjaPogodowa(22);

        CzytnikTemperatury ct1 = new CzytnikTemperatury(1);
        sp.dodajOdbiorce(ct1);

        sp.serTemperatura(27);

        CzytnikTemperatury ct2 = new CzytnikTemperatury(1);
        sp.dodajOdbiorce(ct2);

        sp.serTemperatura(27);
    }
}
