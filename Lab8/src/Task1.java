import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    Scanner sc = new Scanner(System.in);
    String arg = null;
    File file = null;
    Desktop desktop = null;
    Task1() {
        System.out.println("Введите имя файла: ");
        arg = sc.nextLine();
        file = new File(arg);
        System.out.println("Введите данные для записи в файл: ");
        arg = sc.nextLine();
        if (!file.exists())
            try {
                file = new File(file.getName());
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        if (file.isFile()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(arg);
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
    Task1(String arg1, String arg2){
        file = new File(arg1);
        if (file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(arg2);
                fileWriter.flush();
                fileWriter.close();
                if (Desktop.isDesktopSupported()) {
                    desktop = Desktop.getDesktop();
                    desktop.open(file);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else
            System.out.println("Файл не существует!");
    }
}