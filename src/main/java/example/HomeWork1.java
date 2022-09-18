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
        if (headA == null || headB == null) {
            return null;
    }
        int lenA = getLen(headA);
        int lenB = getLen(headB);

        if (lenA > lenB) {
            while (lenA > lenB) {
                headA = headA.next;
                lenA--;
            }
        } else {
            while (lenA < lenB) {
                headB = headB.next;
                lenB--;
            }
        }

        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public int getLen(ListNode node) {
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
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
