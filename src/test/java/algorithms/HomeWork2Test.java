package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork2Test {

    private HomeWork2 homework = new HomeWork2();

    @Test
    void testCase1() {
        int[] nums1 = new int[]{0, 1, 0, 3, 12};

        int[] result = homework.moveZeroes(nums1);

        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, result);
    }

    @Test
    void testCase2() {
        int[] nums1 = new int[]{0, 0, 0, 0, 0};

        int[] result = homework.moveZeroes(nums1);

        Assertions.assertArrayEquals(new int[]{0, 0, 0, 0, 0}, result);
    }

    @Test
    void testCase3() {
        int[] nums1 = new int[]{};

        int[] result = homework.moveZeroes(nums1);

        Assertions.assertArrayEquals(new int[]{}, result);
    }
}
