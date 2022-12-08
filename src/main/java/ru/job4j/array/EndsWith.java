package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int counter = 1;
        while (counter <= post.length) {
            if (word[word.length - counter] != post[post.length - counter]) {
                result = false;
                break;
            }
            counter++;
        }
        return result;
    }
}
