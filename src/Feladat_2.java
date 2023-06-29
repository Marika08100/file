import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feladat_2 {
    public static void main(String[] args) {
        List<String> list = FileInputHandler_2.getLinesOfTextFile("szamok.txt");
        int sum = 0;
        for (var actual : list) {
            for (var actualNumber : actual.split(" ")) {
                sum += Integer.parseInt(actualNumber);

            }
        }
        System.out.println(sum);
    }

    static class FileInputHandler_2 {

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


        public static List<String> getLinesOfTextFile(String filePath) {
            List<String> stringList = new ArrayList<>();


            try {
                FileReader fileReader = new FileReader(filePath); // IOExceptiont dob ha nem található a file a megadott útvonalon
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                // itt végig megyünk a sorokon és hozzá adjuk a listához
                for (String line; (line = bufferedReader.readLine()) != null; ) {
                    stringList.add(line);
                }


            } catch (IOException e) {
                System.out.println("Error: wrong path!\n" + e.getMessage());
            }
            return stringList;
        }
    }
}

// Írj egy osztályt mely tartalmaz egy fájlból olvasó satitikus metódust
// ami bemeneti paraméterként vár egy file pathot
// a metódus térjen vissza egy String listával aminek elemei
// a fájl sorai legyenek
// hívd meg a metódusod szamok.txt re és irasd ki az eredményt
// az eredményed számokat tartalmaz szóközökkel
// elválasztva írasd ki a számok összegét
