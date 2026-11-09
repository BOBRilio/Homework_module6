package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    App app = new App();

    @Test
    void CorrectName(){
        assertEquals("Привет, Мир!", app.greet("Мир"));

    }
    @Test
    void emptyName(){
        assertEquals("Привет, !", app.greet(""));

    }
    @Test
    void nullName(){
        assertEquals("Привет, !", app.greet(null));

    }

}
