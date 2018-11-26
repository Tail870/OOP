package Lab4.Shatilov;

import java.util.Scanner;

public class Main {
    private static Dog dog = null;
    private static Phone phone = null;
    public static void main(String[] args) {
        char menu;
        do {
            System.out.println("1. Собака;");
            System.out.println("2. Телефон;");
            System.out.println("3. Показать всё;");
            System.out.println("0. Выход.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    System.out.print("Введите кличку собаки: ");
                    String arg1 = sc.nextLine();
                    System.out.print("Введите цену собаки: ");
                    int arg2 = sc.nextInt();
                    dog = new Dog(arg1, arg2);
                    break;
                }
                case '2': {
                    System.out.print("Введите модель телефона: ");
                    String arg1 = sc.nextLine();
                    System.out.print("Введите цену телефона: ");
                    int arg2 = sc.nextInt();
                    phone = new Phone(arg1, arg2);
                    break;
                }
                case '3': {
                    if (dog!=null)
                        System.out.println("Имя собаки: "+dog.getName()+", её цена: "+dog.getPrice());
                    else
                        System.out.println("Собаки нет!");
                    if (phone!=null)
                        System.out.println("Модель телефона: "+phone.getName()+", её цена: "+phone.getPrice());
                    else
                        System.out.println("Телефон у гопника или его нет!");
                    break;
                }
            }
        } while (menu != '0' & menu != 'O' & menu != 'o');
    }
}