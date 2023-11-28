package org.example;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find the duplicate elements
 */
public class Question3 {

    public static void main(String[] args) {
        String inputData = "aquickbrownfoxjumpsoverthelazydog";

        System.out.println(Arrays.stream(inputData.split(""))
                .filter(s -> !s.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList());
    }
}
