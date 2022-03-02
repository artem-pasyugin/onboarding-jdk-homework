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
        int count=0;
        for (int i=0; i < nums.length; i++){
            if (nums[i] !=0){ // если элемент в массиве не равен 0 то сдвигает влево
                int temp = nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
    return nums;
    }
}
