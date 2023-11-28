package org.example;


import java.util.Arrays;
import java.util.List;

/**
 * Print all the elements in an Array that starts with 1 or 2 and so on
 */
public class Question8 {

    public static void main(String[] args) {

        int[] elements = {1,23,4,2,66,4,7,8,12};

        List<String> stringList = Arrays.stream(elements)
                .boxed()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .toList();

        System.out.println(stringList);

    }
}
