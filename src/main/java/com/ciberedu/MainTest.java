package com.ciberedu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MainTest {

    public static void main(String[] args) throws IOException {
        System.out.println("Factorial de 0: " + factorial(0));
        System.out.println("Factorial de 1: " + factorial(1));
        System.out.println("Factorial de 2: " + factorial(2));
        System.out.println("Factorial de 3: " + factorial(3));
        System.out.println("Factorial de 5: " + factorial(5));


    }

    //Recursive
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }



}
