package collections;
/**
 * Домашнее задание №2.
 * Дано: Неотсортированный список (LinkedList)
 * Ожидание: Вернуть отсортированный список в порядке возрастания. Например [4, 1, 2] => [1, 2, 4]
 */
public class HomeWork2 {
    /**
     * Функция для сортировки  списка
     *
     */
    static class Node {
        //значение
        int val;
        //ссылка на следующий элемент
        Node next;

        Node(int num)
        {
            this.val = num;
            this.next = null;
        }
    }

    Node head;
    void addNode(int val)
    {
        if (head == null) {
            head = new Node(val);
            return;
        }

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;

        Node newNode = new Node(val);
        curr.next = newNode;
    }

    Node move(Node start, Node end)
    {
        if (start == end || start == null || end == null)
            return start;

        Node previos = start;
        Node current = start;
        int pivot = end.val;

        while (start != end) {
            if (start.val < pivot) {
                // keep tracks of last modified item
                previos = current;
                int temp = current.val;
                current.val = start.val;
                start.val = temp;
                current = current.next;
            }
            start = start.next;
        }

        int temp = current.val;
        current.val = pivot;
        end.val = temp;

//         return предстоящий как текущий

        return previos;
    }
    void printList(Node n)
    {
        while (n != null) {
            System.out.print(n.val);
            System.out.print(" ");
            n = n.next;
        }
    }
    //дописать метод
    void sortLinkedList(Node start, Node end)
    {
        if(start == null || start == end|| start == end.next )
            return;
        Node toPrevious = move(start, end);
        sortLinkedList(start, toPrevious);

        if (toPrevious != null && toPrevious == start)
            sortLinkedList(toPrevious.next, end);

        else if (toPrevious != null
                && toPrevious.next != null)
            sortLinkedList(toPrevious.next.next, end);
    }
}