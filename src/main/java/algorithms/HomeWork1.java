package algorithms;

/**
 * Домашнее задание №1.
 * Дано: Целочисленный массив
 * Ожидание: Проверить на уникальность всех элементов в массиве,
 * не создавая при этом новый массив
 */
public class HomeWork1 {

    /**
     * На входе целочисленный массив
     * Необходимо проверить все ли элементы массива различны
     *
     * @param numbers - массив. Пример: [1,2,3]
     * @return - true массив уникален, а false не уникален
     */
    public boolean checkIsUnique(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


