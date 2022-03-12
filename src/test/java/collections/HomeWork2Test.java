package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HomeWork2Test {

    private final HomeWork2 homeWork = new HomeWork2();


    @ParameterizedTest
    @MethodSource("arguments")
    void testCase(HomeWork2.Node head,
                  HomeWork2.Node expectResult) {

        HomeWork2.Node actual = homeWork.reverseList(head);

        Assertions.assertEquals(actual, expectResult, "Нарушен порядок элементов");
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of(new HomeWork2.Node(1, null), new HomeWork2.Node(1, null)),
                Arguments.of(new HomeWork2.Node(1, new HomeWork2.Node(2, null)), new HomeWork2.Node(2, new HomeWork2.Node(1, null)))
        );
    }
}
