package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork1Test {
    private final HomeWork1 homeWork = new HomeWork1();
    HomeWork1.Product p1 = new HomeWork1.Product("apple", "Poland");
    HomeWork1.Product p2 = new HomeWork1.Product("lemon", "China");
    HomeWork1.Product p3 = new HomeWork1.Product("lemon", "China");

    @Test
    void TestCase(){
        boolean actual = homeWork.compare(p2, p3);
        Assertions.assertEquals(true,actual);
    }

    @Test
    void TestCase2(){
        boolean actual = homeWork.compare(p1, p2);
        Assertions.assertEquals(false,actual);
    }
}
