package klasy;

public class Klasy {

    public void klasy() {

        //realizacja do klasy wewnetrzej
        Zewnetrzna z = new Zewnetrzna();
        Zewnetrzna.Wewnetrzna w = z.new Wewnetrzna();
        w.testNaZew();

        //realizacja klasy wewnetrznej statycznej
        Zewnetrzna.WewnetrznaStatyczna ws = new Zewnetrzna.WewnetrznaStatyczna();
        ws.testNaZewStat();

        //klasy anonimowe
        MojInterfejs mojInterfejs = new MojInterfejs() {

            int x = 10;

            @Override
            public void wyswietlTekst(String pStr) {
                System.out.println(pStr);
                System.out.println(x);
            }
        };

        mojInterfejs.wyswietlTekst("Cześć");
    }
}
