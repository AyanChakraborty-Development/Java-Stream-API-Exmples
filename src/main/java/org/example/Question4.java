package org.example;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * First Non repeated element from the list
 */
public class Question4 {

    public static void main(String[] args) {
        String inputData = "aquickbrownfoxjumpsoverthelazydog";

        Arrays.stream(inputData.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue()==1)
                .findFirst()
                .map(Map.Entry::getKey)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No Non repeated elements")
                );
    }
}
