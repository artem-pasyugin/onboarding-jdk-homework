package example;

import java.util.Arrays;

/**
 * Домашнее задание №1.
 * Дано: целочисленный массив numbers размером n.
 * Ожидание: создать массив result размером 2n, где result[i] == numbers[i] и result[i + n] == numbers[i] для 0 <= i < n.
 */
class HomeWork1 {

    /**
     * Конкатенция входящего массива с заполненными значениями.
     *
     * @param numbers - целочисленный массив, пример [1, 2, 1].
     * @return возвращаемый целочисленный массив, пример [1, 2, 1, 1, 2, 1].
     */
    public int[] run(int[] numbers) {
        int g = numbers.length;
        int[] twonumbers = new int[g * 2];
        int l = 0;
        int b = g;
        while (l < g) {
            twonumbers[l] = numbers[l];
            l++;
        }
        for (int i = g; i < twonumbers.length; i++) {
            twonumbers[i] = twonumbers[g - (b--)];

        }


        String twonumbersString = Arrays.toString(twonumbers);
        System.out.println(twonumbersString);

        // TODO реализовать тут
        return twonumbers;}

}
