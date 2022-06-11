package example;

/**
 * Домашнее задание №2.
 * Дано: Два целочисленных массива
 * Ожидание: Вернуть массив c одинаковыми значениями, встречающимися в двух массивах
 */
public class HomeWork2 {

    /**
     * q
     * Пересечение элементов в двух массивах
     *
     * @param num1 - первый массив. Пример: [1,2,3]
     * @param num2 - второй массив. Пример: [2,5,3]
     * @return -  массив c одинаковыми значениями, встречающимися в двух массивах. Пример: [2,3]
     */
    public int[] intersectionMethod(int[] num1, int[] num2) {
        int[] result = new int[Math.min(num1.length, num2.length)];
        int x = 0;
        for (int i = 0; i < num1.length; i++) {

            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    result[x] = num1[i];
                    x++;
                }
            }
        }
        return result;
    }
}


