package example;

/**
 * Домашнее задание №1.
 * Дано: Целочисленный не пустой массив с повторяющимися значениями от 0 до 10
 * Ожидание: Вернуть уникальный элемент массива
 *
 * Дополнение со звездочкой: Выполнить алгоритм O(n)
 */
public class HomeWork1 {

    /**
     * Поиск элемента, который встречается в массиве только 1 раз
     *
     * @param num - целочисленный массив со значениями от 0 до 10
     * @return уникальный элемент массива, иначе значение -1
     */
    public int singleNumber(int[] num) {
        for (int i = 0; i < num.length; i++) {
            boolean match = false;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j] && i != j) {
                    match = true; //match
                    break;
                } else match = false;
            }
           if (match==false) return num[i];
        }
        return -1;
    }
}