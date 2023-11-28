package org.example;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java program to count the occurrence of each character in a string
 */
public class Question2 {

    public static void main(String[] args) {

        String inputData = "aquickbrownfoxjumpsoverthelazydog";

        String[] splittedString = inputData.split("");

        Map<String, Long> map = Arrays.stream(splittedString)
                .filter(s -> !s.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);
    }
}
