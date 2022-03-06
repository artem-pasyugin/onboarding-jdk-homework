package collections;

import java.util.*;
import java.util.stream.Collectors;

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
        Map<Person, String> map = new TreeMap<>(Comparator.comparing(o -> o.age, Comparator.reverseOrder()));
        for (Person person : persons) {
         map.put(person,comment);
        }
        return map;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && isDeveloper == person.isDeveloper && Objects.equals(name, person.name) && Objects.equals(birthPlace, person.birthPlace);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, birthPlace, isDeveloper);
        }
        }

}
