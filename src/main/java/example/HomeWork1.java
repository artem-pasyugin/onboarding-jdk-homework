package example;

/**
 * Домашнее задание №1.
 * Дано: Две вершины разных одиночных связных списков.
 * A: 4->1->8->4->5
 * B: 5->6->1->8->4->5
 * Ожидание: Вернуть пересечение
 * 4->5
 * Объяснение:
 * Пересечение есть на двух элементах в списках A,B: 4->5
 */
class HomeWork1 {

    /**
     * Пересечение связанных списков
     *
     * @param headA - вершина первого связного списка
     * @param headB - вершина второго связного списка
     * @return пересечение связных списков. Если два связных списка не пересекаются - вернуть null
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // TODO
        return null;
    }

    /**
     * Элемент связного списка
     */
    public static class ListNode {
        // значение
        int val;
        // ссылка на следующий элемент
        ListNode next;

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

}
