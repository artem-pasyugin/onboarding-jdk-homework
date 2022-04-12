package collections;


import java.util.HashSet;

/**
 * Домашнее задание №2.
 * Дано: Класс Node
 * Ожидание: Реализовать метод проверки на уникальные значения
 */
public class HomeWork2 {
    /**
     * @param node - значение, которое необходимо проверить на уникальность
     * @return true  - если значение уникальное, false - неуникальное
     */
    public boolean getUniqueData(Node node) {
        if (node == null || node.next == null) {
            return true;
        }
        Node i = node;
        Node j = node.next;

        boolean isUnique = false;
        while (!i.data.equals(j.data)) {
            isUnique = true;
            while (j.next != null) {
                if (i.data.equals(i.data)) {
                    return false;
                }
                j = j.next;
            }
            i = i.next;
        }
        return isUnique;
    }


    public static class Node {
        private Node next;
        private Integer data;

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
