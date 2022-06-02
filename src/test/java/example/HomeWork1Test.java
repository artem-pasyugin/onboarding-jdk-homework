package example;

import example.HomeWork1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork1Test {
    private final HomeWork1 homework = new HomeWork1();

    @Test
    void testCase1() {
        int[] arr = new int[]{7, 2, 3, 3, 2};
        int result = homework.singleNumber(arr);
        Assertions.assertEquals(7, result);
    }

    @Test
    void testCase2() {
        int[] arr = new int[]{0, 2, 3, 3, 2, 0};
        int result = homework.singleNumber(arr);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void testCase3() {
        int[] arr = new int[]{6, 1, 6};
        int result = homework.singleNumber(arr);
        Assertions.assertEquals(1, result);
    }
}
