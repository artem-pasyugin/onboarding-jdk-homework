package collections;

import java.util.Objects;

/**
 * Домашнее задание №2.
 * Дано: Голова однонаправленного списка в виде объекта с целым значением и с ссылкой на следующий объект
 * Ожидание: Вернуть объект с хвоста. Например [0, 1, 2] => [2, 1, 0]
 */
class HomeWork2 {

    /**
     * Функция для переворота односвязанного списка
     *
     * @param head - голова списка
     * @return - обратный порядок начиная с хвоста
     */
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        else {
            Node remaining = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return remaining;
        }
    }

    /**
     * Объект с целым значением и ссылкой на следующий элемент
     */
    static class Node {
        //значение
        int val;
        //ссылка на следующий элемент
        Node next;


        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            Node node = (Node) o;
            return Objects.equals(val, node.val);
        }
    }
}
