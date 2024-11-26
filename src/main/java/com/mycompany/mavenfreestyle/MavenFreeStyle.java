package com.mycompany.mavenfreestyle;

public class MavenFreeStyle {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public int fibonacci(int a) {
        switch (a) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}
