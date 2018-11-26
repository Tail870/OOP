package Lab2.Shatilov.Book;

import java.util.Scanner;

public class BookTest {
    private static Book book = null;
    public static void main(String[] args){
        char menu;
        do {
            System.out.println("1. Создать книгу;");
            System.out.println("2. Вывести свойства книги;");
            System.out.println("0. Выход.");
            Scanner sc = new Scanner(System.in);
            menu = sc.nextLine().charAt(0);
            switch (menu){
                case '1':{
                    String arg;
                    int arg2;
                    book = new Book();
                    System.out.print("Введите название: ");
                    arg = sc.nextLine();
                    book.setName(arg);
                    System.out.print("Введите автора: ");
                    arg = sc.nextLine();
                    book.setAuthor(arg);
                    System.out.print("Введите год выхода: ");
                    arg2 = sc.nextInt();
                    book.setDate(arg2);
                    System.out.print("Введите кол-во стр.: ");
                    arg2 = sc.nextInt();
                    book.setPages(arg2);
                    break;
                }
                case '2':{
                    if (book!=null)
                        book.getData();
                    else
                        System.out.println("Сначала создайте книгу!");
                    break;
                }
            }
        } while (menu!='0'&menu!='O'&menu!='o');
    }
}