package Lab5.Shatilov;

public class Main {
    public static String arg;
    public static void main(String[] args) {
        if (args.length>0)
            arg = args[0];
        new MenuDialog();
    }
}
