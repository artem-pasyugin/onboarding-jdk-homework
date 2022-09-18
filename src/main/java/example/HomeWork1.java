package example;


import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.HashSet;


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
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> hashSet = new HashSet<ListNode>();

        while (headA != null) {
            hashSet.add(headA);
            headA = headA.next;
        }

        for (int i = 0; i < hashSet.size(); i++) {
            if (headA != null && headB != null) {
                headA = headA.next;
                if (hashSet.equals(headB)) {

                    return headA;
                }
                headA = headB;
                headB = headB.next;
            }
        }

        return null;

        // TODO
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
