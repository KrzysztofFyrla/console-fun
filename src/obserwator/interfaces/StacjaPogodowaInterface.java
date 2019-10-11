package obserwator.interfaces;

import obserwator.CzytnikTemperatury;

public interface StacjaPogodowaInterface {

    void dodajOdbiorce(CzytnikTemperatury ct);
    void usunOdbiorce(CzytnikTemperatury ct);
    void powiadom();
}
