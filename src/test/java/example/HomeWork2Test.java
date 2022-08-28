package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeWork2Test {

    private final HomeWork2 homeWork = new HomeWork2();

    @ParameterizedTest
    @MethodSource("arguments")
    void testCase(int[] param, int[] result) {
        int[] expected = homeWork.run(param);
        Assertions.assertArrayEquals(expected, result);
    }


    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 4}, new int[]{2, 4, 3, 1}),
                Arguments.of(new int[]{1}, new int[]{1}),
                Arguments.of(new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }
}
