package filmSimulator;

public class Film {

    String title;
    String type;
    String director;
    int boxOffice;

    public Film() {
    }

    public Film(String title, String type, String firector, int boxOffice) {
        this.title = title;
        this.type = type;
        this.director = firector;
        this.boxOffice = boxOffice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(int boxOffice) {
        this.boxOffice = boxOffice;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title + " " +
                "Gatunek: " + type + " " +
                "Reżyser: " + director + " " +
                "Box Office: " +boxOffice;
    }
}
