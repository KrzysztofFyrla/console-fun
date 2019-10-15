package klasy;

public class Zewnetrzna {

    public int a = 1;
    public int b = 2;

    public static int c = 3;
    private static int d = 4;

    public void testDoWew() {
        Wewnetrzna w = new Wewnetrzna();
        w.testNaZew();
    }

    class Wewnetrzna {

        public void testNaZew() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(Zewnetrzna.c);
            System.out.println(Zewnetrzna.d);

            //testDoWew();

            System.out.println("Klasa wewnętrzna zwykła");
        }
    }

    static class WewnetrznaStatyczna {

        public static int a = 1;

        public void testNaZewStat() {
            System.out.println(a);

            System.out.println("Klasa wewnętrzna statyczna");
        }
    }
}
