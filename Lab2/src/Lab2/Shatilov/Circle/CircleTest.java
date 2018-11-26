package Lab2.Shatilov.Circle;

import java.util.Scanner;

public class CircleTest {
    private static Circle circle = null;
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            char menu;
            do {
                System.out.println("1. Задать параметры круга.");
                System.out.println("2. Показать параметры круга.");
                System.out.println("0. Выход.");
                menu = sc.nextLine().charAt(0);
                switch (menu){
                    case '1':{
                        circle = new Circle();
                        System.out.print("Введите Х: ");
                        float arg1 = sc.nextFloat();
                        System.out.print("Введите Y: ");
                        float arg2 = sc.nextFloat();
                        circle.setCenter(arg1,arg2);
                        System.out.print("Введите диаметр: ");
                        arg1 = sc.nextFloat();
                        circle.setDiameter(arg1);
                        break;
                    }
                    case '2':{
                        if (circle!=null) {
                            System.out.println("Введите параметр:\n" +
                                    "X - показать Х центра круга;\n" +
                                    "Y - показать Y центра круга;\n" +
                                    "R - показать радиус круга;\n" +
                                    "D - показать диаметр круга;\n" +
                                    "0 - назад.");
                            do {
                                menu = sc.nextLine().charAt(0);
                                if (menu == 'X' || menu == 'x')
                                    circle.getData('x');
                                if (menu == 'Y' || menu == 'y')
                                    circle.getData('y');
                                if (menu == 'R' || menu == 'r')
                                    circle.getData('r');
                                if (menu == 'D' || menu == 'd')
                                    circle.getData('d');
                            } while (menu!='0'&menu!='O'&menu!='o');
                        }
                        else System.out.println("Круг не задан!");
                        break;
                    }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
}
