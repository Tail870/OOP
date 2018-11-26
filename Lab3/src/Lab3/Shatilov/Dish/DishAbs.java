package Lab3.Shatilov.Dish;

public abstract class DishAbs {
    private String material;
    private String filledWith;
    private String name;
    private int height;

    public void setMaterial(String arg){
        material=arg;
    }
    public void setFood(String arg){
        filledWith=arg;
    }
    public void setName(String arg){ name=arg; }
    public void setHeight(int arg) { height=arg; }

    public abstract void setSize(int arg);
    public abstract void setAll();
    public abstract void outputData();

    @Override
    public String toString(){
        return ("Название тарелки:"+name+"\nМатериал: "+material+"\nЧем заполнена: "+filledWith+"\nГлубина: "+height);
    }
}