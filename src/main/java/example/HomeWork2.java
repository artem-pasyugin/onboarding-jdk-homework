package example;

import java.util.HashMap;
import java.util.Map;

/**
 * Домашнее задание №2.
 * Дано: Реализовать собственную структуру HashMap
 * <p>
 * Ожидание: Все функции реализованы и описаны по стандарту javaDoc
 */
public class HomeWork2 {
    private int key = 0;
    private int value = 0;
    Map<Integer, Integer> homeWork2 = new HashMap<>();
    // TODO
    public void put(int key, int value) {
        this.key = key;
        this.value = value;
        homeWork2.put(key,value);
        // TODO
    }

    // TODO
    public int get(int key) {
        // TODO
        return homeWork2.get(key);
    }

    // TODO
    public void remove(int key) {
        homeWork2.remove(key);
        // TODO
    }

    // TODO
    public long size() {
        // TODO
        return homeWork2.size();
    }
}