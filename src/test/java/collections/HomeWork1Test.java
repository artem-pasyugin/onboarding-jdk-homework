package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


class HomeWork1Test {

    private final HomeWork1 homeWork = new HomeWork1();


    @ParameterizedTest
    @MethodSource("arguments")
    void testCase(List<HomeWork1.Person> persons,
                  String comment,
                  Map<HomeWork1.Person, String> expectResult) {

        Map<HomeWork1.Person, String> actualMap = homeWork.getPersonsWithCommentWithAgeSort(persons, comment);

        Assertions.assertNotNull(actualMap);
        Assertions.assertEquals(List.copyOf(expectResult.keySet()), List.copyOf(actualMap.keySet()), "Нарушен порядок элементов");
    }


    private static Stream<Arguments> arguments() {
        List<HomeWork1.Person> people = List.of(new HomeWork1.Person("1", 30, "Москва", false),
                new HomeWork1.Person("2", 25, "Воронеж", true),
                new HomeWork1.Person("3", 20, "Сургут", false),
                new HomeWork1.Person("1", 30, "Москва", false) //этот дубликат удалится
        );

        String comment = "comment";
        Map<HomeWork1.Person, String> expectResult = new LinkedHashMap<>();

        expectResult.put(people.get(0), comment);
        expectResult.put(people.get(1), comment);
        expectResult.put(people.get(2), comment);


        List<HomeWork1.Person> people1 = List.copyOf(people);
        return Stream.of(
                Arguments.of(null, comment, Collections.EMPTY_MAP),
                Arguments.of(people1, comment, expectResult)
        );
    }
}
