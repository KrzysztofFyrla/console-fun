package abstraction;

public class Square extends Figure {

    /**ponieżej znajdują się dwie metody dziedziczące po klasie abstrakcyjne Figure,
    które są przysłonięciem metod w kalsie abstrakcyjnej*/

    @Override
    public void rysuj() {
        System.out.println("Rysuje kwadrat");
    }

    @Override
    public void pole() {
        System.out.println("Obliczam pole kwadratu");
    }
}
