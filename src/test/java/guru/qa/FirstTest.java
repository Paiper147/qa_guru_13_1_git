package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void FirstTest(){
        Assertions.assertTrue(3 >= 0);
    }

    @Test
    void SecondTest(){
        Assertions.assertTrue(4 >= 0);
    }
}
