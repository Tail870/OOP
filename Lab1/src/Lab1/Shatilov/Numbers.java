package Lab1.Shatilov;

import java.util.Random;

public class Numbers {
    private int[] mass;

    Numbers(int n) { //Генерация массива целых чисел.
        mass = new int[n];
        for (int i=0; i<n; i++)
            mass[i] = new Random().nextInt(100);
    }

    public void Sort(){ //Сортировка массива методом выборки.
        for (int min = 0; min < mass.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < mass.length; j++) {
                if (mass[j] < mass[least]) {
                    least = j;
                }
            }
            int tmp = mass[min];
            mass[min] = mass[least];
            mass[least] = tmp;
        }
    }

    public void Sum(){ //Сумма элементов массива.
        int sum = 0;
        int i;
        for (i=0; i<mass.length; i++)
            sum = sum+mass[i];
        System.out.print("FOR. Сумма массива: "+sum);
        System.out.print("\n");

        sum = 0;
        i=0;
        while (i<mass.length){
            sum = sum+mass[i];
            i++;
        }
        System.out.print("WHILE. Сумма массива: "+sum);
        System.out.print("\n");

        sum = 0;
        i=0;
        do {
            sum = sum+mass[i];
            i++;
        } while (i<mass.length);
        System.out.print("DO WHILE. Сумма массива: "+sum);
        System.out.print("\n");
        sum = 0;
    }

    public void PrintLn(){ //Вывод всех элементов массива.
        int i = 0;
        if (mass.length>0) {
            System.out.print("Элементы массива: ");
            for (i = 0; i < mass.length; i++)
                System.out.print(mass[i] + " ");
            System.out.print("\n");
        }
    }
}
