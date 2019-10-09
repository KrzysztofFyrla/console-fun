package ifInaczej;

public class IfInaczej {

    public void ifInaczej() {

        IfInaczej ifInaczej = new IfInaczej();

        int x = 1;

        //zwykły if
        if (x<5){
            System.out.println("x<5");
        } else {
            System.out.println("x>5");
        }

        //skrócony if
        String str = (x<5) ? "x<5" : "x>5";
        System.out.println(str);

        //if w sout
        System.out.println((x<5) ? "x<5" : "x>5");

        //if z obiektu
        System.out.println((x<5) ? ifInaczej.metoda1() : ifInaczej.metoda2());

        //skrócony if jako argument metody
        String sttr = ifInaczej.metoda3((x<5) ? "x<5" : "x>5");
        System.out.println(sttr);

        //if z metody
        System.out.println(ifInaczej.metoda4(8));

        //najczęściej wykorzystywany do
        String str3 = null;
        String nowyStr = (str3 != null) ? "nie jest nullem" : "jest nullem";
        System.out.println(nowyStr);
    }

    public String metoda1() {
        return "x<5";
    }

    public String metoda2() {
        return "x>5";
    }

    public String metoda3(String str) {
        return str;
    }

    public String metoda4(int x) {
        return (x<5) ? "x<5" : "x>5";
    }
}
