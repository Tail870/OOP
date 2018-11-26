package Lab3.Shatilov.Dog;

public class BigDog extends DogAbs{
    public final boolean isSmall = false;
    public final boolean isBig = true;

    @Override
    public void setName(String arg){
        name = arg;
    }

    @Override
    public void setLegs(int arg){
        legs = arg;
    }

    @Override
    public void setTailLenght(int arg){
        tailLenght = arg;
    }

    @Override
    public void setWeight(int arg){
        weight = arg;
    }

    @Override
    public void setHeight(int arg){
        height = arg;
    }

    @Override
    public String toString(){
        return ("Имя: "+name+"\nВес: "+weight+"\nВысота: "+
                height+"\nЛап: "+legs+"\nДлина хвоста: "+tailLenght+"\nКрупная порода.");
    }
}
