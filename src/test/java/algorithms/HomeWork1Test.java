package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork1Test {

    private final HomeWork1 homework = new HomeWork1();

    @Test
    void testCase1() {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{2, 5, 6};

        int[] result = homework.merge(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{1, 2, 2, 5, 6}, result);
    }

    @Test
    void testCase2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{0};

        int[] result = homework.merge(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{0,1}, result);
    }

    @Test
    void testCase3() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};

        int[] result = homework.merge(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }
}
