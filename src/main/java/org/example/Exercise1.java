package org.example;

import org.example.model.User;
import org.example.utili.StreamSources;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream()
                .filter(integer -> integer < 5)
                .forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream()
                .filter(integer -> integer > 5)
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("Print the first number in intNumbersStream that's greater than 5." +
                "If nothing is found, print -1");

        System.out.println(StreamSources.intNumbersStream()
                .filter(integer -> integer > 5)
                .sorted()
                .findFirst()
                .orElse(-1));

        // Print first names of all users in userStream
        System.out.println("Print first names of all users in userStream");
        StreamSources.userStream()
                .map(User::getFirstName)
                .forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        //

        System.out.println("Print first names in userStream for users that have IDs from number stream");
        StreamSources.userStream()
                .filter(Exercise1::isIdFromIdList)
                .map(User::getFirstName)
                .forEach(System.out::println);

    }

    private static boolean isIdFromIdList(User user) {
        return StreamSources.intNumbersStream()
                .anyMatch(integer -> integer.equals(user.getId()));
    }

}
