package typGeneryczny;

public class TypySparam {

    public void typeSparam() {

        TypGen<Integer> tg = new TypGen<>(10);
        int x = tg.getObj();
        System.out.println(x);

        TypGen<String> tg2 = new TypGen<>("Test");
        String str = tg2.getObj();
        System.out.println(str);

        //można przyjmować wiele danych o różnych parametrach
    }
}

class TypGen<T> {

    T obj;

    public TypGen(T obj) {
        this.obj = obj;
    }

    //metoda dla programisty aby sprawdzić jaki to typ
    void pokazTyp() {
        System.out.println(obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }
}
