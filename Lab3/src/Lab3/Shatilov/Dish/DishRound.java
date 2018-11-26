package Lab3.Shatilov.Dish;

import java.util.Scanner;

public class DishRound extends DishAbs{
    private int diameter;

    @Override
    public void setAll(){
        Scanner sc = new Scanner(System.in);
        String arg;
        int arg2;

        System.out.print("Введите название кр.тарелки: ");
        arg = sc.nextLine();
        setName(arg);

        System.out.print("Введите материал: ");
        arg = sc.nextLine();
        setMaterial(arg);

        System.out.print("Введите диаметр: ");
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
        diameter=arg;
    }

    @Override
    public void outputData() {
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return(super.toString()+"\nДиаметр тарелки: "+diameter);
    }
}
