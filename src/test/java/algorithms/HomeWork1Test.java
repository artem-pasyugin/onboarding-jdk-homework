package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeWork1Test {
    private final HomeWork1 homework = new HomeWork1();

    @Test
    public void testCase1() {
        int[] arr = {1, 1, 2, 3, 4};
        assertFalse(homework.checkIsUnique(arr));
    }

    @Test
    public void testCase2() {
        int[] arr = {1, 0, 2, 3, 3};
        assertFalse(homework.checkIsUnique(arr));
    }

    @Test
    public void testCase3() {
        int[] arr = {1, 2, 3, 4, 5};
        assertTrue(homework.checkIsUnique(arr));
    }

    @Test
    public void testCase4() {
        int[] arr = {1, 4, 2, 2, 3, 6};
        assertFalse(homework.checkIsUnique(arr));
    }

    @Test
    public void testCase5() {
        int[] arr = {5, 5};
        assertFalse(homework.checkIsUnique(arr));
    }
}
