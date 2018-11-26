package Lab7.Shatilov;

import java.util.Scanner;
import Lab7.Shatilov.ArrayListTest.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char menu;
        do {
            System.out.println("1. Проверить ArrayList;");
            System.out.println("2. Проверить LinkedList;");
            System.out.println("3. Проверить самодельную коллекцию;");
            System.out.println("0. Выход.");
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    new FurnitureShop();
                    break;
                }
                case '2': {
                    new LinkedListTest();
                    break;
                }
                case '3': {
                    new CustomArrayTest();
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
}
