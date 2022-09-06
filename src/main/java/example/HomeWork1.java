package example;

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
        int newNumbersLength = numbers.length * 2;
        int[] twonumbers = new int[newNumbersLength];
        for (int i = 0; i < newNumbersLength; i++) {
            if (i < numbers.length) {
                twonumbers[i] = numbers[i];
            } else {
                twonumbers[i] = numbers[i - numbers.length];
            }
        }
        // TODO реализовать тут
        return twonumbers;
    }

}
