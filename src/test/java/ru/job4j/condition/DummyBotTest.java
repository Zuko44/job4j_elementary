package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DummyBotTest {

    @Test
    public void whenAnswerHiBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAnswerByBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAnswerUnknownBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}