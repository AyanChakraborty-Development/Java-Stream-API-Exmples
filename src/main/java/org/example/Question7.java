package org.example;

import java.util.stream.Stream;

/**
 * Longest strign from the given array
 */
public class Question7 {

    public static void main(String[] args) {

        String s = Stream.of("Ayan", "tatai", "Shanti", "Borsha", "aaaaaa","eeeeee")
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .get();

        System.out.println(s);

    }
}
