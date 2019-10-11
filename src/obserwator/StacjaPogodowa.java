package obserwator;

import obserwator.interfaces.StacjaPogodowaInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class StacjaPogodowa implements StacjaPogodowaInterface {

    ArrayList<CzytnikTemperatury> odbiorcy;
    int temperatura;

    //inicjowanie wartości początkowej
    public StacjaPogodowa(int temperatura) {
        odbiorcy = new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void dodajOdbiorce(CzytnikTemperatury ct) {
        odbiorcy.add(ct);
    }

    @Override
    public void usunOdbiorce(CzytnikTemperatury ct) {
        odbiorcy.remove(ct);
    }

    @Override
    public void powiadom() {
        Iterator<CzytnikTemperatury> it = odbiorcy.iterator();
        while (it.hasNext()) {
            CzytnikTemperatury ct = it.next();
            ct.update(temperatura);
        }
    }

    public void serTemperatura(int nowaTemperatura) {
        System.out.println("Nowa wartość: " + nowaTemperatura);
        temperatura = nowaTemperatura;
        powiadom();
    }
}
