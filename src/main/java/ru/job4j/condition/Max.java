package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        int result = max(max(left, right), third);
        return result;
    }

    public static int max(int left, int right, int third, int forth) {
        int result = max(max(max(left, right), third), forth);
        return result;
    }

    public static void main(String[] args) {
        int msg = Max.max(33, 33);
        System.out.println(msg);
    }
}
