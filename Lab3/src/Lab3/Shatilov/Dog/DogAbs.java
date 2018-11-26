package Lab3.Shatilov.Dog;

public abstract class DogAbs {
    protected static String name;
    protected static int legs;
    protected static int tailLenght;
    protected static int weight;
    protected static int height;

    public abstract void setName(String arg);
    public abstract void setLegs(int arg);
    public abstract void setTailLenght(int arg);
    public abstract void setWeight(int arg);
    public abstract void setHeight(int arg);
}
