package Lab7.Shatilov;

import Lab7.Shatilov.ArrayListTest.*;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
        private static LinkedList<FurnitureAbs> furniture = null;

        public LinkedListTest(){
            furniture = new LinkedList<>();
            char menu;
            do {
                System.out.println("1. Создать мебель;");
                System.out.println("2. Просмотреть мебель;");
                System.out.println("3. Убрать мебель;");
                System.out.println("0. Выход из магазина.");
                Scanner sc = new Scanner(System.in);
                menu = sc.nextLine().charAt(0);
                switch (menu) {
                    case '1': {
                        System.out.print("Введите кол-во создаваемой мебели: ");
                        int arg;
                        arg = sc.nextInt();
                        makeFurniture(arg);
                        break;
                    }
                    case '2': {
                        if (furniture!=null)
                            for (int i=0; i<furniture.size(); i++)
                                System.out.println("||||||| Мебель №"+(i+1)+":\n"+furniture.get(i).toString());
                        else
                            System.out.println("Сначала создайте какую-нибудь мебель!");
                        break;
                    }
                    case '3': {
                        System.out.print("Введите № удаляемой мебели: ");
                        int arg;
                        arg = sc.nextInt();
                        if (furniture!=null) {
                            if (furniture.size() >= arg & arg>0) {
                                furniture.remove(arg-1);
                            } else
                                System.out.println("Мебель не найдена.");
                        }
                        else
                            System.out.println("Сначала создайте какую-нибудь мебель!");
                        break;
                    }
                }
            } while (menu!='0'&menu!='O'&menu!='o');
        }

        private static void makeFurniture(int arg){
            char menu;
            for (int i=0; i<arg; i++){
                System.out.println("Создание мебели №"+(i+1)+":");
                System.out.println("1. Создать стол;");
                System.out.println("2. Создать стул;");
                System.out.println("3. Создать диван.");
                Scanner sc = new Scanner(System.in);
                menu = sc.nextLine().charAt(0);
                switch (menu) {
                    case '1': {
                        furniture.add(new Table());
                        break;
                    }
                    case '2': {
                        furniture.add(new Chair());
                        break;
                    }
                    case '3': {
                        furniture.add(new Sofa());
                        break;
                    }
                }
            }
        }
}
