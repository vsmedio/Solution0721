import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.


Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] vect = new int[20];

        //напишите тут ваш код
        for (int i=0;i<20;i++){
            vect[i] = Integer.parseInt(reader.readLine());
        }

        maximum = vect[0];
        minimum = vect[0];
        for (int i=0;i<vect.length;i++){
            if (vect[i] > maximum)
                maximum = vect[i];
            if (vect[i] < minimum)
                minimum = vect[i];
        }

        System.out.println(maximum+" "+minimum);
    }
}
