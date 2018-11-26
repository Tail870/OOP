package Lab2.Shatilov.Human;

import java.util.Scanner;

public class Human {
    private static Head head[];
    private static Hand hand[];
    private static Leg leg[];
    private static float height;
    private static float weight;

    public void setHead(int a){
        head = new Head[a];
        for (int i=0; i<a; i++){
            head[i] = new Head();
            Scanner sc = new Scanner(System.in);
            System.out.print("Есть волосы на голове "+(i+1)+"? true/false ");
            boolean arg;
            arg = sc.nextBoolean();
            head[i].setHair(arg);
        }
    }
    public void setHand(int a){
        hand = new Hand[a];
        for (int i=0; i<a; i++){
            hand[i] = new Hand();
            Scanner sc = new Scanner(System.in);
            System.out.print("Есть волосы на руке "+(i+1)+"? true/false ");
            boolean arg;
            arg = sc.nextBoolean();
            hand[i].setHair(arg);
        }
    }
    public void setLeg(int a){
        leg = new Leg[a];
        for (int i=0; i<a; i++){
            leg[i] = new Leg();
            Scanner sc = new Scanner(System.in);
            System.out.print("Есть волосы на ноге "+(i+1)+"? true/false ");
            boolean arg;
            arg = sc.nextBoolean();
            leg[i].setHair(arg);
        }
    }
    public void setWeight(int arg){
        weight=arg;
    }
    public void setHeight(int arg){
        height=arg;
    }

    public void getData(){
        System.out.println("Вес: "+weight);
        System.out.println("Рост:"+height);
        int i;
        System.out.println("Голов: "+head.length);
        for (i=0; i<head.length; i++)
            System.out.println("Волосы на голове "+(i+1)+": "+head[i].getHair());
        System.out.println("Рук: "+hand.length);
        for (i=0; i<hand.length; i++)
            System.out.println("Волосы на руке "+(i+1)+": "+hand[i].getHair());
        System.out.println("Ног: "+leg.length);
        for (i=0; i<leg.length; i++)
            System.out.println("Волосы на ноге "+(i+1)+": "+leg[i].getHair());
        if (head.length==1 & hand.length==0 & leg.length==0)
            if (head[0].getHair())
                System.out.println("Папа, я ВОЛОСАТЫЙ колобок!..");
            else
                System.out.println("Папа, я колобок!..");
        if (head.length==3)
            System.out.println("Папа, я Цербер!..");
    }
}
