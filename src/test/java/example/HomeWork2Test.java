package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;


class HomeWork2Test {

    private final HomeWork2 homeWork = new HomeWork2();

    @ParameterizedTest
    @MethodSource("arguments")
    void testCase(Map<Integer, Integer> map) {

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            homeWork.put(entry.getKey(), entry.getValue());
            Assertions.assertEquals(entry.getValue(), homeWork.get(entry.getKey()));

            homeWork.remove(entry.getKey());
            Assertions.assertEquals(0, homeWork.size());
        }
    }


    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Map.of(1, 2, 3, 4, 5, 6)),
                Arguments.of(Map.of(0, 0)),
                Arguments.of(Map.of(1, 1))
        );
    }
}
