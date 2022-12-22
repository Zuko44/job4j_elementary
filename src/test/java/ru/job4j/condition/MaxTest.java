package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMaxA2B3Then3() {
        int a = 2;
        int b = 3;
        int expected = 3;
        int result = Max.max(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxA4B3Then4() {
        int a = 4;
        int b = 3;
        int expected = 4;
        int result = Max.max(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxA5B5Then5() {
        int a = 5;
        int b = 5;
        int expected = 5;
        int result = Max.max(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxA5B5C10Then10() {
        int a = 5;
        int b = 5;
        int c = 10;
        int expected = 10;
        int result = Max.max(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxA5B5C10D20Then20() {
        int a = 5;
        int b = 5;
        int c = 10;
        int d = 20;
        int expected = 20;
        int result = Max.max(a, b, c, d);
        assertThat(result).isEqualTo(expected);
    }
}
