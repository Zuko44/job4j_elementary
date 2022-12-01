package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(3, 3, 4);
        System.out.println(result);
        boolean result2 = Triangle.exist(2, 2, 4);
        System.out.println(result2);
    }
}
