package Lab2.Shatilov.Human;

import java.util.Scanner;

public class HumanTest {
    private static Human human = null;
    public static void main(String[] args){
        char menu;
        do {
            System.out.println("1. Создать человека;");
            System.out.println("2. Вывести свойства человека;");
            System.out.println("0. Выход.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu){
                case '1':{
                    int arg;
                    human = new Human();
                    System.out.print("Введите рост: ");
                    arg = sc.nextInt();
                    human.setHeight(arg);
                    System.out.print("Введите вес: ");
                    arg = sc.nextInt();
                    human.setWeight(arg);
                    System.out.print("Введите кол-во голов: ");
                    arg = sc.nextInt();
                    human.setHead(arg);
                    System.out.print("Введите кол-во рук: ");
                    arg = sc.nextInt();
                    human.setHand(arg);
                    System.out.print("Введите кол-во ног: ");
                    arg = sc.nextInt();
                    human.setLeg(arg);
                    break;
                }
                case '2':{
                    if (human!=null)
                        human.getData();
                    else
                        System.out.println("Сначала создайте человека!");
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
}
