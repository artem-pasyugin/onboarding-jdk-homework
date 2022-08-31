package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class HomeWork1Test {

    private final HomeWork1 homeWork = new HomeWork1();

    @ParameterizedTest
    @MethodSource("arguments")
    void testCase(int[] param, int[] result) {
        int[] expected = homeWork.run(param);
        Assertions.assertArrayEquals(expected, result);
    }


    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 1}, new int[]{1, 2, 1, 1, 2, 1}),
                Arguments.of(new int[]{1, 3, 2, 1}, new int[]{1, 3, 2, 1, 1, 3, 2, 1}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }
}