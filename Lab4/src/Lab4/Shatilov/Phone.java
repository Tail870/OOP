package Lab4.Shatilov;

public class Phone implements Nameable, Priceable {
    private String model;
    private int price;

    public Phone(String arg1, int arg2){
        model = arg1;
        price= arg2;
    }

    @Override
    public String getName(){
        return model;
    };

    @Override
    public int getPrice(){
        return price;
    }
}
