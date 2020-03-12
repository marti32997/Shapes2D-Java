package com.YosuaMartiansia.A2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Person_Test {

    @Test
    public void should_Return_Hello_World() {
        Person Yosua = new Person();
        assertEquals("Hello World", Yosua.hello_World());
    }

    @Test
    public void should_Return_Name() {
        Person person = new Person();
        assertEquals("Hello Yosua", person.hello("Yosua"));
    }
}
