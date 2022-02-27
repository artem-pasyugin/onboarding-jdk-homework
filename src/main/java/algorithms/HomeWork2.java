package algorithms;

/**
 * Домашнее задание №2.
 * Дано: Массив со повторяющими значениями от 0 до 10
 * Ожидание: Вернуть массив с нулями в конце
 */
public class HomeWork2 {

    /**
     * Перемещение нулевых элементов в конец массива
     *
     * @param nums - целочисленный массив со значениями от 0 до 10
     * @return измененный nums массив с нулями в конце
     */
    public int[] moveZeroes(int[] nums) {

        int[] shiftedArray = new int[nums.length];
        int count = 0;
        for (int num : nums) {
            if (num != 0) {
                shiftedArray[count] = num;
                count++;
            }
        }
     return nums;
    }
}
