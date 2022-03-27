package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class HomeWork1Test {
    private final HomeWork1 homeWork = new HomeWork1();
    HomeWork1.Product p1 = new HomeWork1.Product("apple", "Poland");
    HomeWork1.Product p2 = new HomeWork1.Product("lemon", "China");
    HomeWork1.Product p3 = new HomeWork1.Product("lemon", "China");


    @Test
    void TestCase3() {
        Set<HomeWork1.Product> actual = homeWork.convertProductsToSet(Arrays.asList(p1, p2));
        Assertions.assertEquals(2, actual.size());
    }

    @Test
    void TestCase4() {
        Set<HomeWork1.Product> actual = homeWork.convertProductsToSet(Arrays.asList(p2, p3));
        Assertions.assertEquals(1, actual.size());
    }

    @Test
    void TestCase5() {
        Set<HomeWork1.Product> actual = homeWork.convertProductsToSet(List.of());
        Assertions.assertEquals(0, actual.size());
    }
}
