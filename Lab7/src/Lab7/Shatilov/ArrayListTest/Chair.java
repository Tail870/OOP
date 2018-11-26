package Lab7.Shatilov.ArrayListTest;

import java.util.Scanner;

public class Chair extends FurnitureAbs {
    private int legs;
    public Chair(){
        String arg;
        int arg2;
        System.out.print("Введите материал: ");
        Scanner sc = new Scanner(System.in);
        arg = sc.nextLine();
        setMaterial(arg);
        System.out.print("Введите кол-во ножек: ");
        arg2 = sc.nextInt();
        setLegs(arg2);
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

    public void setLegs(int arg) { legs = arg; }

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
        return ("Материал стула - "+material+
                ",\nкол-во ножек - "+legs+",\nвес - "+weight+
                ",\nстоимость - "+cost);
    }
}
