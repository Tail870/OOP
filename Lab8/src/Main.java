import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char menu;
        do {
            System.out.println("1. Запись в файл введённой с клавиатуры информации;");
            System.out.println("2. Вывод информации из файла на экран;");
            System.out.println("3. Заменить информацию в файле на информацию, введённую с клавиатуры;");
            System.out.println("4. Добавить в конец файла текст, введённый с клавиатуры;");
            System.out.println("5. Выполнить 1, 2,3 и 4;");
            System.out.println("0. Выход.");
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    new Task1();
                    break;
                }
                case '2': {
                    new Task2();
                    break;
                }
                case '3': {
                    new Task3();
                    break;
                }
                case '4': {
                    new Task4();
                    break;
                }
                case '5': {
                    System.out.println("1. Запись в файл...");
                    new Task1();
                    System.out.println("2. Вывод информации из файла...");
                    new Task2();
                    System.out.println("3. Заменить информацию в файле...");
                    new Task3();
                    System.out.println("4. Добавить в конец файла текст, введённый с клавиатуры...");
                    new Task4();
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
}