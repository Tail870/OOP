import java.io.File;
import java.util.Scanner;

public class Task3 {
    Scanner sc = new Scanner(System.in);
    String arg1, arg2;
    File file;
    Task3() {
        System.out.println("Введите имя файла: ");
       arg1 = sc.nextLine();
        file = new File(arg1);
        System.out.println("Введите данные для перезаписи в файл: ");
        arg2 = sc.nextLine();
        new Task1(arg1, arg2);
    }
}
