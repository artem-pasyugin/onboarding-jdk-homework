package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HomeWork2Test {
    private final HomeWork2 homeWork = new HomeWork2();
    List<Integer> expected = new LinkedList<Integer>(Arrays.asList(3, 4, 5, 20, 30));

    @Test
    void testCase1(){
        HomeWork2 list = new HomeWork2();
        list.addNode(30);
        list.addNode(3);
        list.addNode(4);
        list.addNode(20);
        list.addNode(5);

        HomeWork2.Node n = list.head;
        while (n.next != null)
            n = n.next;
        list.printList(list.head);
        list.sortLinkedList(list.head, n);
        HomeWork2.Node actual = list.head;
        String res = actual.toString();
        list.printList(list.head);
        Assertions.assertEquals(expected, res);
    }
}
