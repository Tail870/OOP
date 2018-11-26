package Lab7.Shatilov.ArrayListTest;

import java.util.Scanner;

public class Sofa extends FurnitureAbs {
    private int lenght;
    private int pillows;
    public Sofa(){
        String arg;
        int arg2;
        System.out.print("Введите материал: ");
        Scanner sc = new Scanner(System.in);
        arg = sc.nextLine();
        setMaterial(arg);
        System.out.print("Введите длину: ");
        arg2 = sc.nextInt();
        setLenght(arg2);
        System.out.print("Введите кол-во подушек: ");
        arg2 = sc.nextInt();
        setPillows(arg2);
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

    public void setLenght(int arg) { lenght=arg; }

    public void setPillows(int arg) {pillows=arg; }

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
        return ("Материал дивана - "+material+
                ",\nдлина - "+lenght+",\nкол-во подушек - "+pillows
                +",\nвес - "+weight+",\nстоимость - "+cost);
    }
}
