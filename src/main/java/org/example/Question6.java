package org.example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Second-highest number from a given array
 */
public class Question6 {

    public static void main(String[] args) {

        var n = 2;  // nth highest element, here 2nd highest so n=2
        var pos = n-1;

        Stream.of(99, 10, 999, 100, 1000)
                .sorted(Comparator.reverseOrder())
                .skip(pos)
                .findFirst()
                .ifPresent(
                        System.out::println
                );



    }
}
