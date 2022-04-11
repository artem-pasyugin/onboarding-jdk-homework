package collections;

import java.util.*;


/**
 * Домашнее задание №1.
 * Дано: Класс Product
 * Ожидание: Реализовать метод convertProductsToSet возвращающий Set продуктов
 */
public class HomeWork1 {

    /**
     * Функция convertProductsToSet
     *
     * @param products - список продуктов
     * @return вернуть Set
     */
    public Set<Product> convertProductsToSet(List<Product> products) {
        Set<Product> result = new HashSet<>(products);
        return result;
    }

    public static class Product {
        private final String name;
        private final String country;

        public Product(String name, String country) {
            this.name = name;
            this.country = country;
        }
    }
}


