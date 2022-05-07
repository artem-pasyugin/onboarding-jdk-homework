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
    void testCase(String param, String result) {
        String expected = homeWork.run(param);
        Assertions.assertEquals(expected, result);
    }


    private static Stream<Arguments> arguments() {
        return Stream.of(
                //TODO
                Arguments.of("param", "result")
        );
    }
}
