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

    public void declare() {
        Map<String, Integer> map1 = new HashMap<>();

        HashMap<String, Integer> map2 = new HashMap<>();
    }
    public void put(int key, int value) {
            Map<String, Integer> map = new HashMap<>();
            // Add elements to HashMap
            map.putIfAbsent("k1", 1);
            map.putIfAbsent("k2", 2);
            map.putIfAbsent("k3", 3);
            map.putIfAbsent(null, 4);
            map.putIfAbsent("k4", null);
            map.putIfAbsent("k1", 10);

            System.out.println(map);

    }

    public int get(int key) {

            Map<String, Integer> map = new HashMap<>(Map.of("k1", 1, "k2", 2));
            int value = map.get("k1");

        return 0;
    }

    public void remove(int key) {

    }

    public long size() {
        // TODO
        return 0;
    }
}