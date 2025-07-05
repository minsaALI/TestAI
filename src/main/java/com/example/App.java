package com.example;

public class App {
    public static void main(String[] args) {
        // Unused variable (Sonar issue)
        int unused = 0;
        String a=null;
        String b="Hi";
        System.out.println(a.equals(b));
        // Duplicate string literals (Sonar issue)
        System.out.println("Hello World");
        System.out.println("Hello World");

        // System.out used (Sonar issue)
        System.out.println("Using system out");

        // Cognitive complexity (Sonar issue)
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    }
                }
            }
        }
    }
}
