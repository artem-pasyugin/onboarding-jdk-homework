package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork2Test {
    HomeWork2 homeWork = new HomeWork2();
    HomeWork2.Node node1 = new HomeWork2.Node(7, new HomeWork2.Node(7, null));
    HomeWork2.Node node2 = new HomeWork2.Node(2, null);


    @Test
    void testCase1() {
        boolean actual = homeWork.getUniqueData(node1);
        Assertions.assertFalse(actual);
    }

    @Test
    void testCase2() {
        boolean actual = homeWork.getUniqueData(node2);
        Assertions.assertTrue(actual);
    }
}
