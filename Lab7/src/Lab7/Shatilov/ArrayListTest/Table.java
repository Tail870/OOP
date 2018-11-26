package Lab7.Shatilov.ArrayListTest;

import java.util.Scanner;

public class Table extends FurnitureAbs {
    private int height;
    public Table() {
        String arg;
        int arg2;
        System.out.print("Введите материал: ");
        Scanner sc = new Scanner(System.in);
        arg = sc.nextLine();
        setMaterial(arg);
        System.out.print("Введите высоту: ");
        arg2 = sc.nextInt();
        setHeight(arg2);
        System.out.print("Введите вес: ");
        arg2 = sc.nextInt();
        setWeight(arg2);
        System.out.print("Введите стоимость: ");
        arg2 = sc.nextInt();
        setCost(arg2);
    }

    @Override
    public void setMaterial(String arg){
            material = arg;
        }

    public void setHeight(int arg){
        height = arg;
    }

    @Override
    public void setWeight(int arg){
            weight = arg;
        }

    @Override
    public void setCost(int arg){
            cost = arg;
        }

    @Override
    public String toString(){
        return ("Материал стола - "+material+
                ",\nвысота - "+height+",\nвес - "+weight+
                ",\nстоимость - "+cost);
    }
}
