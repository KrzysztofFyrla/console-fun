package searchHome;

public class Home {

    String city;
    String district;
    String street;
    float sizeHome;
    int price;
    int numberRooms;

    public Home(String city, String district, String street, float sizeHome, int price, int numberRooms) {
        this.city = city;
        this.district = district;
        this.street = street;
        this.sizeHome = sizeHome;
        this.price = price;
        this.numberRooms = numberRooms;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public float getSizeHome() {
        return sizeHome;
    }

    public void setSizeHome(float sizeHome) {
        this.sizeHome = sizeHome;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }
}
