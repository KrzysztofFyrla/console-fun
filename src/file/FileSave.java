package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSave {

    public void fileSave() throws IOException {
        String fileName = nameFile();
        FileWriter fileWriter = null;
        String content;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj treść swojej notatki a ja ją zapiszę do pliku o nazwie " + fileName + " :)");
        content = scanner.nextLine();

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("Problem dostępu do pliku");
        } finally {
            if (fileWriter == null) {
                System.out.println("Problem");
            }
            fileWriter.close();
        }
    }

    public String nameFile() {
        return "plik.txt";
    }
}
