import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fealadat_1 {
    public static void main(String[] args) {
        System.out.println(FileInputHandlerr.getLinesOfTextFileWithScanner("peldaStrings.txt"));
    }
}

// Ez az osztály felel azért hogy lekezeljük a bejövő fájlt
class FileInputHandlerr {

    public static List<String> getLinesOfTextFileWithScanner(String filePath) {
        List<String> stringList = new ArrayList<>();

        File file = new File(filePath);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                stringList.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
}


// Írj egy osztályt mely tartalmaz egy fájlból olvasó statitikus metódust
// ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei a fájl sorai legyenek
// hívd meg a metódusod peldaString.txt re és irasd ki az eredményt
