package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result += Character.toString(symbol);
                if (counter > 1) {
                    result += Integer.toString(counter);
                }
                counter = 1;
                symbol = input.charAt(i);
            } else {
                counter++;
            }
        }
        result += Character.toString(symbol);
        if (counter > 1) {
            result += Integer.toString(counter);
        }
        return result;
    }
}
