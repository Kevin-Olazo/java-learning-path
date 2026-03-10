package com.ciberedu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class MainTest {

    public static void main(String[] args) throws IOException {
        // convertir entero n a binario

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String binaryString = Integer.toBinaryString(n);

        int count = 0;
        int maxCount = 0;

        for(char c : binaryString.toCharArray()) {
            if(c == '1'){
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }

        bufferedReader.close();



    }




}
