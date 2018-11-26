import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    Scanner sc = new Scanner(System.in);
    String arg;
    File file;
    Task4() {
        System.out.println("Введите имя файла: ");
        arg = sc.nextLine();
        file = new File(arg);
        System.out.println("Введите данные для записи в конец файла: ");
        arg = sc.nextLine();
        Desktop desktop = null;
        if (!file.exists()) {
                System.out.println("Нет такого файла!");
                return;
            }
        if (file.isFile()) {
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("\n" +arg);
                fileWriter.flush();
                fileWriter.close();
                if (Desktop.isDesktopSupported()) {
                    desktop = Desktop.getDesktop();
                    desktop.open(file);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}