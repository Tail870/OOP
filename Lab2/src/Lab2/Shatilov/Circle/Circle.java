package Lab2.Shatilov.Circle;

public class Circle {
    private float xCenter;
    private float yCenter;
    private float diameter;
    public void setCenter(float x, float y){
        xCenter=x;
        yCenter=y;
    }
    public void setDiameter(float d){
        diameter=d;
    }
    public void getData(char arg){
        switch (arg){
            case 'x':
                System.out.println("X="+xCenter);
                break;
            case 'y':
                System.out.println("Y="+yCenter);
                break;
            case 'd':
                System.out.println("Diameter="+diameter);
                break;
            case 'r':
                System.out.println("Radius="+diameter/2);
                break;
            default:
                System.out.println("ERROR!");
                break;
        }
    }
}
