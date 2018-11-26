package Lab3.Shatilov.Dish;

import java.util.Scanner;

public class DishSquare extends DishAbs{
    private int side;

    @Override
    public void setAll(){
        Scanner sc = new Scanner(System.in);
        String arg;
        int arg2;

        System.out.print("Введите название кв.тарелки: ");
        arg = sc.nextLine();
        setName(arg);

        System.out.print("Введите материал: ");
        arg = sc.nextLine();
        setMaterial(arg);

        System.out.print("Введите длину ребра: ");
        arg2 = sc.nextInt();
        setSize(arg2);

        System.out.print("Введите глубину: ");
        arg2 = sc.nextInt();
        setHeight(arg2);

        System.out.print("Введите название еды: ");
        sc = new Scanner(System.in);
        arg = sc.nextLine();
        setFood(arg);
    }

    @Override
    public void setSize(int arg) {
        side=arg;
    }
    public void outputData() {
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return(super.toString()+"\nДлина ребра тарелки: "+side);
    }
}
