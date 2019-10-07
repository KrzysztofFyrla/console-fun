package builder;

public class Budowniczy {

    public void budowniczy() {

        //wywołanie obiektu za pomoca buildera
        Pojazd p = new Pojazd.Builder()
                .id(1)
                .marka("Ford")
                .rejetracja("ABC123")
                .predkoscMax(220)
                .poduszkiPowietrzne(2)
                .kola(4)
                .build();

        System.out.println("Obiekt wywołany za pomocą buildera: ");
        System.out.println(p.getId());
        System.out.println(p.getMarka());
        System.out.println(p.getRejestracja());
        System.out.println(p.getPregkoscMax());
        System.out.println(p.getPoduszkiPowietrzne());
        System.out.println(p.getKola());

        Pojazd p2 = new Pojazd.Builder()
                .id(2)
                .marka("Ford")
                .rejetracja("FVS321")
                .predkoscMax(180)
                .poduszkiPowietrzne(4)
                .kola(4)
                .build();

        System.out.println("Obiekt2 wywołany za pomocą buildera: ");
        System.out.println(p2.getId());
        System.out.println(p2.getMarka());
        System.out.println(p2.getRejestracja());
        System.out.println(p2.getPregkoscMax());
        System.out.println(p2.getPoduszkiPowietrzne());
        System.out.println(p2.getKola());
    }
}
