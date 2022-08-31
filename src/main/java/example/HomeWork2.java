package example;

import java.util.Arrays;

/**
 * Домашнее задание №1.
 * Дано: целочисленный массив numbers размером n.
 * Ожидание: все четные числа должны быть в начале, а нечетные после четных чисел.
 */
class HomeWork2 {

    /**
     * Сортировка массива по четным и нечетным значениям.
     *
     * @param numbers - целочисленный массив, пример [5, 6, 1, 2].
     * @return - целочисленный массив, пример результата [6, 2, 5, 1].
     */
    public int[] run(int[] numbers) {
        int p = numbers.length;
        int k = 0;
        int f = 0;
        int t;
        int l = 0;
        int[] ordernumbers = new int[p];
        for (int i = 0; i < p; i++) {
            if (numbers[k] != 1 && numbers[k] % 2 == 0) {
                ordernumbers[f] = numbers[k];
                f++;
            }
            k++;
        }

        t = f;

        for (int h = 0; h < p; h++) {
            if (numbers[l] == 1 || numbers[l] % 2 == 1) {
                ordernumbers[t] = numbers[l];
                t++;
            }
            l++;
        }
        String ordernumbersString = Arrays.toString(ordernumbers);
        System.out.println(ordernumbersString);
        // TODO реализовать тут
        return ordernumbers;

    }

}
