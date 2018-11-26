import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    Scanner sc = new Scanner(System.in);
    String arg;
    File file;
    Task2() {
        System.out.println("Введите имя файла: ");
        arg = sc.nextLine();
        file = new File(arg);
        arg = "";
        try{
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                arg += scanner.nextLine() + "\n";
            }
            fileReader.close();
            System.out.println("\n" + arg + "\n");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}