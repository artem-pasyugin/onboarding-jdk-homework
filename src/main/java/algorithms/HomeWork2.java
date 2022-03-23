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
    public int[] sortByAscendingOrder(int numbers[]) {
        boolean result = false;
        int k = 1000;
        int h = 0;
        do {
            h++;
            result = true;
            for (int i = 0; i < numbers.length-1; i++){
                int a1 = numbers[i];

                if (numbers[i] >= numbers[i+1]){
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = a1;
                    result = false;
                }
            }
        }
        while (!result && h < k);
        for (int number : numbers) {
            System.out.print(number + ", ");

        }
        System.out.print("--------");


        return numbers;
    }
}