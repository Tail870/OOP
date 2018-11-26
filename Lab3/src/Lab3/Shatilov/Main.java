package Lab3.Shatilov;

import Lab3.Shatilov.Dish.*;
import Lab3.Shatilov.Dog.*;
import Lab3.Shatilov.Furniture.*;

import java.util.Scanner;

public class Main {
    private static DishAbs dish = null;
    private static DogAbs dog = null;
    private static FurnitureAbs furniture = null;
    public static void main(String[] args) {
        char menu;
        do {
            System.out.println("1. Тарелка;");
            System.out.println("2. Собака;");
            System.out.println("3. Мебель;");
            System.out.println("0. Выход.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    menuDish();
                    break;
                }
                case '2': {
                    menuDog();
                    break;
                }
                case '3': {
                    menuFurniture();
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }

    private static void menuDish(){
        char menu;
        do {
            System.out.println("1. Создать тарелку;");
            System.out.println("2. Вывести тарелку;");
            System.out.println("0. Назад.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    makeDish();
                    break;
                }
                case '2': {
                    if (dish!=null)
                        dish.outputData();
                    else
                        System.out.println("Сначала создайте тарелку!");
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');}
    private static void makeDish() {
        char menu;
        System.out.println("1. Создать круглую тарелку;");
        System.out.println("2. Создать квадратную тарелку;");
        System.out.println("Люб.др.символ. Назад.");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextLine().charAt(0);
        switch (menu) {
            case '1': {
                dish = new DishRound();
                dish.setAll();
                break;
            }
            case '2': {
                dish = new DishSquare();
                dish.setAll();
                break;
            }
        }
    }

    private static void menuDog(){
        char menu;
        do {
            System.out.println("1. Создать собаку;");
            System.out.println("2. Вывести собаку;");
            System.out.println("0. Назад.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    makeDog();
                    break;
                }
                case '2': {
                    if (dog!=null)
                        System.out.println(dog.toString());
                    else
                        System.out.println("Сначала создайте собаку!");
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
    private static void makeDog(){
        System.out.println("1. Создать большую собаку;");
        System.out.println("2. Создать маленькую собаку;");
        System.out.println("Люб.др.символ. Назад.");
        char menu;
        Scanner sc = new Scanner(System.in);
        menu = sc.nextLine().charAt(0);
        switch (menu) {
            case '1': {
                dog = new BigDog();
                String arg;
                int arg2;
                System.out.print("Введите название породы: ");
                arg = sc.nextLine();
                dog.setName(arg);
                System.out.print("Введите количество лап: ");
                arg2 = sc.nextInt();
                dog.setLegs(arg2);
                System.out.print("Введите длину хвоста: ");
                arg2 = sc.nextInt();
                dog.setTailLenght(arg2);
                System.out.print("Введите вес: ");
                arg2 = sc.nextInt();
                dog.setWeight(arg2);
                System.out.print("Введите рост: ");
                arg2 = sc.nextInt();
                dog.setHeight(arg2);
                break;
            }
            case '2': {
                dog = new SmallDog();
                break;
            }
        }
    }

    private static void menuFurniture(){
        char menu;
        do {
            System.out.println("1. Создать мебель;");
            System.out.println("2. Вывести мебель;");
            System.out.println("3. Войти в магазин;");
            System.out.println("0. Назад.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu) {
                case '1': {
                    makeFurniture();
                    break;
                }
                case '2': {
                    if (furniture!=null)
                        System.out.println(furniture.toString());
                    else
                        System.out.println("Сначала создайте мебель!");
                    break;
                }
                case '3': {
                    furnitureShop();
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
    private static void makeFurniture(){
        System.out.println("1. Создать стол;");
        System.out.println("2. Создать стул;");
        System.out.println("3. Создать диван;");
        System.out.println("Люб.др.символ. Назад.");
        char menu;
        Scanner sc = new Scanner(System.in);
        menu = sc.nextLine().charAt(0);
        switch (menu) {
            case '1': {
                furniture = new Table();
                break;
            }
            case '2': {
                furniture = new Chair();
                break;
            }
            case '3': {
                furniture = new Sofa();
                break;
            }
        }
    }

    private static void furnitureShop(){
        new FurnitureShop();
    }
}
