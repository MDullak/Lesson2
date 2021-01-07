import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    void shouldGreetMariusz() {
        String result = HelloWorld.greetPerson("Mariusz");

        Assertions.assertEquals("Hello Mariusz !", result);
    }

    @Test
    void shouldGreetKasia() {
        String result = HelloWorld.greetPerson("Kasia");

        Assertions.assertEquals("Hello Kasia !", result);
    }

    @Test
    void shouldGreetSebastian() {
        String result = HelloWorld.greetPerson("Sebastian");

        Assertions.assertEquals("Hello Sebastian !", result);
    }

    @Test
    void shouldGreetPawel() {
        String result = HelloWorld.greetPerson("Paweł");

        Assertions.assertEquals("Hello Paweł !", result);
    }

    @Test
    void shouldGreetKamil() {
        String result = HelloWorld.greetPerson("Kamil");

        Assertions.assertEquals("Hello Kamil !", result);
    }


    @Test
    void shouldAddTwoNumbers() {
        long result = HelloWorld.addTwoNumbers(1l, 2l);

        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldDivide10by2() {
        int result = HelloWorld.divideNumers(10,2);
        Assertions.assertEquals(5, result);
    }

    @Test
    void shouldDivide10by3() {
        int result = HelloWorld.divideNumers(10,3);
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldDivide15by0() {
        int result = HelloWorld.divideNumers(15,0);
        Assertions.assertEquals(-1, result);
    }

}
