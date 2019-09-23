package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOpen extends FileSave {

    public void fileOpen() throws IOException {

        BufferedReader bufferedReader = null;
        FileSave fileSave = new FileSave();

        try {
            bufferedReader = new BufferedReader(new FileReader(fileSave.nameFile()));
            String linia = null;
            do {
                linia = bufferedReader.readLine();
                if (linia != null){
                    System.out.println(linia);
                }
            }while(linia != null);
        } catch (FileNotFoundException e) {
            System.out.println("Problem dostępu do pliku");
        } finally {
            bufferedReader.close();
        }
    }
}
