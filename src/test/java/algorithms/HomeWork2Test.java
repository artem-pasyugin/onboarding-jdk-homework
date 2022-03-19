package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork2Test {
    private final HomeWork2 homework = new HomeWork2();

    @Test
    public void testCase1() {
        int[] data = {0, 2, -8, 5, 1};
        int[] expectedResult = {-8, 0, 1, 2, 5};
        int[] actualResult = homework.sortByAscendingOrder(data);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase2() {
        int[] data = {0, 2, 2, 5, 0};
        int[] expectedResult = {0, 0, 2, 2, 5};
        int[] actualResult = homework.sortByAscendingOrder(data);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase3() {
        int[] data = {};
        int[] expectedResult = {};
        int[] actualResult = homework.sortByAscendingOrder(data);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testCase4() {
        int[] data = {0};
        int[] expectedResult = {0};
        int[] actualResult = homework.sortByAscendingOrder(data);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
