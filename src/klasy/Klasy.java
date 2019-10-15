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

    }
}
