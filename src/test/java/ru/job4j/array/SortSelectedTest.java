package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSortFiveElements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeElements() {
        int[] data = new int[] {3, 4, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFiveElementsAgain() {
        int[] data = new int[] {32, 43, 21, 65, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {8, 21, 32, 43, 65};
        assertThat(result).containsExactly(expected);
    }
}