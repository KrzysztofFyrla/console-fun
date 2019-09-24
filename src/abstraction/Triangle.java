package abstraction;

public class Triangle extends Figure {

    @Override
    public void rysuj() {
        System.out.println("Rysuje trójkąt");
    }

    @Override
    public void pole() {
        System.out.println("Obliczam pole trójkąta");
    }
}
