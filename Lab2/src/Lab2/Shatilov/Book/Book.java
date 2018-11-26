package Lab2.Shatilov.Book;

public class Book {
    private static String author;
    private static String name;
    private static int date;
    private static int pages;
    public static void setAuthor(String arg){ author = arg; }
    public static void setName(String arg){ name = arg; }
    public static void setDate(int arg){ date = arg; }
    public static void setPages(int arg){ pages = arg; }
    public static String getAuthor(){ return author; }
    public static String getName(){ return name; }
    public static int getDate(){ return date; }
    public static int getPages(){ return  pages; }
    public static void getData(){
        System.out.println("Название книги: "+getAuthor());
        System.out.println("Автор:"+getName());
        System.out.println("Год издания: "+getDate());
        System.out.println("Кол-во стр.: "+getPages());
    }
}
