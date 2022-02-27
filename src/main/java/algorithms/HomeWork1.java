package algorithms;

/**
 * Домашнее задание №1.
 * Дано: Два отсортированных целочисленных массива
 * Ожидание: Вернуть объединенный отсортированный массив
 * <p>
 * Дополнение со звездочкой: Выполнить алгоритм O(m + n),
 * где m - размер первого массива, n - размер второго массива
 */
public class HomeWork1 {

    /**
     * На входе два отсортированных целочисленного массива
     * Необходимо их объединить и вернуть отсортированный массив
     *
     * @param nums1 - первый массив. Пример: [1,2]
     * @param nums2 - второй массив. Пример: [2,5,6]
     * @return - объединенный отсортированный массив. Пример: [1,2,2,5,6]
     */



    public int[] merge(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, r = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[r] = nums1[i];
                i++;
            } else {
                result[r] = nums2[j];
                j++;
            }
            r++;
        }
        if (i < nums1.length) {
            System.arraycopy(nums1, i, result, r, (nums1.length - i));
        }
        if (j < nums2.length) {
            System.arraycopy(nums2, j, result, r, (nums2.length - j));
        }
        return result;

//        if (nums1.length == 0) {
//            return nums2;
//        }
//        if (nums2.length == 0) {
//            return nums1;
//        }
//
//        int[] result = new int[nums1.length + nums2.length];
//
//        return result;
    }
}
