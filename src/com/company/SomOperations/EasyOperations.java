package com.company.SomOperations;

import java.util.List;
import java.util.stream.Collectors;

public class EasyOperations {

    public static List<Integer> plusOne(List<Double> list) {
        return list.stream().map(Double::intValue).map(i -> i + 1).collect(Collectors.toList());
    }


    public static List<Character> deleteRepeats(String string) {
        List<Character> splitеedString = string.chars().distinct().mapToObj(c -> (char) c).collect(Collectors.toList());
        return splitеedString;
    }


    public static List<char[]> splitToCharArray(List<String> list) {
        List<char[]> splittedList = list.stream().map(str -> str.toCharArray()).collect(Collectors.toList());
        return splittedList;
    }


    public static void printTheLastValue(List<Integer> numbers) {
        List<Character> strings1 = numbers.stream()
                .map(String::valueOf)
                .map(s -> s.charAt(s.length() - 1))
                .collect(Collectors.toList());
        System.out.println(strings1);
    }
}
