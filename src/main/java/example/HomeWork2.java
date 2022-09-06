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
        int numbersLength = numbers.length;
        int l = 0;
        int[] ordernumbers = new int[numbersLength];
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 == 0) {
                ordernumbers[l] = numbers[i];
                l++;
            }
        }
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % 2 != 0) {
                ordernumbers[l] = numbers[i];
                l++;
            }
        }
        String ordernumbersString = Arrays.toString(ordernumbers);
        System.out.println(ordernumbersString);
        // TODO реализовать тут
        return ordernumbers;

    }

}
