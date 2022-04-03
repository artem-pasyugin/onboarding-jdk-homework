package algorithms;

/**
 * Домашнее задание №2.
 * Дано: Целочисленный массив
 * Ожидание: упорядочить список по возрастанию
 */
public class HomeWork2 {
    /**
     * На входе целочисленный массив
     * Необходимо отсортировать массив по возрастанию
     *
     * @param numbers - массив. Пример: [1,2]
     * @return - отсортированный массив
     */
    public int[] sortByAscendingOrder(int[] numbers) {
        bubbleSort(numbers);
        return numbers;
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
    }
}
