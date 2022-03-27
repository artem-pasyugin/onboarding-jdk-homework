package collections;

import java.util.Objects;
/**
 * Домашнее задание №2.
 * Дано: Класс Products
 * Ожидание: Вернуть boolean значение
 */
public class HomeWork1 {
    /**
     * Функция для сравнения объектов
     *
     * @param x,y - объекты
     * @return - boolean значение
     */
    public boolean compare (Product x, Product y){
        if (x.equals(y)){
            return  true;
        }
        return false;
    }
    public static class Product {
        String name;
        String country;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Objects.equals(name, product.name) && Objects.equals(country, product.country);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, country);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }

        public Product(String name, String country) {
            this.name = name;
            this.country = country;
        }
    }
}
