package example;

import example.HomeWork2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeWork2Test {
    private final HomeWork2 homework = new HomeWork2();

    @ParameterizedTest
    @MethodSource("twoArrays")
    void testCase1(int[] num1, int[] num2, int[] expected) {
        int[] result = homework.intersectionMethod(num1, num2);
        Assertions.assertArrayEquals(expected, result);
    }

    public static Stream<Arguments> twoArrays() {
        return Stream.of(
                Arguments.of(new int[]{2, 0, 3}, new int[]{2, 3, 5}, new int[]{2, 3, 0}),
                Arguments.of(new int[]{1, 0, 3, 4}, new int[]{1, 4, 3}, new int[]{1, 3, 4}),
                Arguments.of(new int[]{0}, new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{0}, new int[]{}, new int[]{}));
    }
}
