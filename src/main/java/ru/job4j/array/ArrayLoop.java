package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int number = 0; number < arr.length; number++) {
            arr[number] = number * 2 + 3;
        }
        for (int number : arr) {
            System.out.println(number);
        }
    }
}
