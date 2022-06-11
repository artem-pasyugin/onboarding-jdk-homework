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
    void testCase(HomeWork1.ListNode listNode1, HomeWork1.ListNode listNode2, HomeWork1.ListNode expected) {
        HomeWork1.ListNode result = homeWork.getIntersectionNode(listNode1, listNode2);

        if (expected == null) {
            Assertions.assertNull(result);
            return;
        } else if (result == null) {
            Assertions.fail("Результат не должен быть пустым");
        }

        int i = 1;
        while (result.next != null) {
            if (result.val != expected.val) {
                Assertions.fail("Нету совпадения на элементе с номером %s".formatted(i));
            }
            result = result.next;
            expected = expected.next;
            i++;
        }

    }


    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(new HomeWork1.ListNode(4, new HomeWork1.ListNode(1, new HomeWork1.ListNode(8, new HomeWork1.ListNode(4, new HomeWork1.ListNode(5, null))))),
                        new HomeWork1.ListNode(5, new HomeWork1.ListNode(6, new HomeWork1.ListNode(1, new HomeWork1.ListNode(8, new HomeWork1.ListNode(4, new HomeWork1.ListNode(5, null)))))),
                        new HomeWork1.ListNode(1, new HomeWork1.ListNode(8, new HomeWork1.ListNode(4, new HomeWork1.ListNode(5, null))))),
                Arguments.of(new HomeWork1.ListNode(2, new HomeWork1.ListNode(6, new HomeWork1.ListNode(4, null))),
                        new HomeWork1.ListNode(1, new HomeWork1.ListNode(5, null)),
                        null),
                Arguments.of(new HomeWork1.ListNode(1, null),
                        new HomeWork1.ListNode(1, null),
                        new HomeWork1.ListNode(1, null))
        );
    }
}
