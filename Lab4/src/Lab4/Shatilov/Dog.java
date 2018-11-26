package Lab4.Shatilov;

public class Dog implements Nameable, Priceable {
    private String name;
    private int price;

    public Dog(String arg1, int arg2){
        name = arg1;
        price= arg2;
    }

    @Override
    public String getName(){
        return name;
    };

    @Override
    public int getPrice(){
        return price;
    }
}
