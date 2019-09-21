package createCharacter;

public class Character {

    public String name;
    public String color;
    public int age;

    public Character() {
    }

    public Character(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void test() {
        System.out.println("test poprawny");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
