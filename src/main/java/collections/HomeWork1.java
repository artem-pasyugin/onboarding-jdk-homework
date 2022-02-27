package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Домашнее задание №1.
 * Дано: Список Persons с комментарием.
 * Ожидание: Вернуть Map с отсортированным возрастом по убыванию.
 */
class HomeWork1 {

    /**
     * Функция преобразования из списка Persons с комментарием.
     *
     * @param persons - список персон, может содержать дубли
     * @param comment - комментарий
     * @return Map, где ключ - Person с возрастом по убыванию, а значение - комментарий.
     */
    public Map<Person, String> getPersonsWithCommentWithAgeSort(List<Person> persons, String comment) {
        if (persons == null) {
            return new HashMap<>();
        }

        return null;
    }

    /**
     * Информация о человеке
     */
    public static class Person {
        //ФИО
        private String name;
        //Возраст
        private int age;
        //Место рождения
        private String birthPlace;
        //Является разработчиком ?
        private boolean isDeveloper;

        public Person(String name, int age, String birthPlace, boolean isDeveloper) {
            this.name = name;
            this.age = age;
            this.birthPlace = birthPlace;
            this.isDeveloper = isDeveloper;
        }
    }
}
