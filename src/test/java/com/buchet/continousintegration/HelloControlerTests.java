package com.buchet.continousintegration;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControlerTests {
    @Test
    public void shouldReturnHelloWorldWhenNameIsNull() {
        HelloControler helloControler = new HelloControler();
        String result = helloControler.index(null);
        assertThat(result).isEqualTo("Hello World !");
    }
    @Test
    public void shouldReturnHelloPhilWhenNameIsNotNull() {
        HelloControler helloControler = new HelloControler();
        String result = helloControler.index("Phil");
        assertThat(result).isEqualTo("Hello Phil !");
    }
}
