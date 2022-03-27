package collections;


/**
 * Домашнее задание №2.
 * Дано: Класс Node
 * Ожидание: Реализовать метод проверки на уникальные значения
 */
public class HomeWork2 {
    /**
     *
     * @param node - значение, которое необходимо проверить на уникальность
     * @return true  - если значение уникальное, false - неуникальное
     */
    public boolean getUniqueData(Node node) {

        return false;
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
