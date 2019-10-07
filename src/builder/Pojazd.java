package builder;

/**Wzorzec projektowy Builder -> podczas wywołania takiej klasy, przy zwykłym kontruktorze trzeba podawać wszystkie
 * parametry, a one muszą być podowane według kolejności kontruktora. Dzięki temu wzorcowi jest to niepotrzebne.*/

public class Pojazd {

    //składowe opisujące pojazd
    private Integer id;
    private String marka;
    private Integer kola;
    private Integer poduszkiPowietrzne;
    private Integer pregkoscMax;
    private String rejestracja;

    public static class Builder {
        private Integer id = null;
        private String marka = null;
        private Integer kola = null;
        private Integer poduszkiPowietrzne = null;
        private Integer predkoscMax= null;
        private String rejestracja = null;

        //każda z tych metod zwraca obiekt typu Builder i przyjmuje dane parametry

        public Builder id(Integer id){
            this.id = id;
            return this;
        }

        public Builder marka(String marka){
            this.marka = marka;
            return this;
        }

        public Builder kola(Integer kola){
            this.kola = kola;
            return this;
        }

        public Builder poduszkiPowietrzne(Integer poduszkiPowietrzne){
            this.poduszkiPowietrzne = poduszkiPowietrzne;
            return this;
        }

        public Builder predkoscMax(Integer predkoscMax){
            this.predkoscMax = predkoscMax;
            return this;
        }

        public Builder rejetracja(String rejestracja){
            this.rejestracja = rejestracja;
            return this;
        }

        //metoda build sięga po prywatny konstruktor pojazd, gdzie przekazujemy builder
        public Pojazd build(){
            return new Pojazd(this);
        }
    }

    private Pojazd(Builder builder){
        this.id = builder.id;
        this.marka = builder.marka;
        this.kola = builder.kola;
        this.poduszkiPowietrzne = builder.poduszkiPowietrzne;
        this.pregkoscMax = builder.predkoscMax;
        this.rejestracja = builder.rejestracja;
    }

    public Integer getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public Integer getKola() {
        return kola;
    }

    public Integer getPoduszkiPowietrzne() {
        return poduszkiPowietrzne;
    }

    public Integer getPregkoscMax() {
        return pregkoscMax;
    }

    public String getRejestracja() {
        return rejestracja;
    }
}
