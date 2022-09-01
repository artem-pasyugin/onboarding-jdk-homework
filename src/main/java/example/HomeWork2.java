package example;

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
        int[] newMassive = new int[numbers.length];
        int j=0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2==0) {
                newMassive[j]=numbers[i];
                j++;
            }
        }
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2!=0) {
                newMassive[j]=numbers[i];
                j++;
            }
        }
        return newMassive;
    }
}
