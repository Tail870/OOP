package Lab1.Shatilov;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        Numbers nums = null;
        do {
            MenuList();
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch (menu) { //Меню. Для подробностей пунктов - см. вывод кода, а также метод MenuList
                case 1:
                    if (nums != null)
                        nums.Sum();
                    else
                        System.out.println("Сгенерируйте массив через п.4!");
                    break;
                case 2:
                    if (args.length>0) {
                        System.out.println("Аргументы запуска командной строки:");
                        for (String arg : args) System.out.println(arg);
                    } else
                        System.out.println("Аргументов командной строки нет.");
                    break;
                case 3:
                    System.out.println("Обычными дробями: ");
                    for (int i=1; i<11; i++){
                        System.out.print("1/"+i+" ");
                    }
                    System.out.println("\nДесятичными дробями: ");
                    for (int i=1; i<11; i++){
                        System.out.print((float) 1/i+" ");
                    }
                    System.out.print("\n");
                    break;
                case 4:
                    int n;
                    System.out.println("Введите количество элементов: ");
                    n = sc.nextInt();
                    nums = new Numbers(n);
                    nums.PrintLn();
                    nums.Sort();
                    nums.PrintLn();
                    break;
                case 5:
                    Factorial();
                    break;
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
    private static void MenuList() { //Метод, который показывает меню программы.
        System.out.println("1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.");
        System.out.println("2. Вывести на экран аргументы командной строки в цикле for.");
        System.out.println("3. Вывести на экран первые 10 чисел гармонического ряда.");
        System.out.println("4. Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.");
        System.out.println("5. Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.");
        System.out.println("0. Выход.");
    }
    private static void Factorial(){ //Метод вычисления факториала через FOR
        System.out.print("Введите число: ");
        int f,out = 1;
        f = sc.nextInt();
        for (int i=1; i<f+1; i++) {
            out = out * i;
        }
        System.out.println("Факториал числа "+f+"="+out);
    }
}
