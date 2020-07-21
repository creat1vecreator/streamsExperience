package com.company.WorkingWithText;


import java.util.*;
import java.util.stream.Collectors;

import static com.company.WorkingWithText.FileReader.splittedList;


public class Demonstrate {

    private static FileReader fileReader;

    public Demonstrate(FileReader fileReader) {
        Demonstrate.fileReader = fileReader;
    }

    Demonstrate() {

    }

    public static int maxLength(List<String> list) {
        int max = 0;
        int counter;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() < list.get(i + 1).length()) {
                counter = list.get(i + 1).length();
                if (counter > max)
                    max = counter;
            }
        }
        return max;
    }

    public static int maxLengthFeature(List<String> list) {
        int max = list.get(0).length();
        for (int i = 0; i < list.size() - 1; i++) {
            max = Math.max(list.get(i).length(), max);
        }
        return max;
    }

    public static int maxLengthFeature2(List<String> list) {
        return Collections.max(list.stream().map(str -> str.length()).collect(Collectors.toList()));
    }


    public static int averageString(List<String> list) {
        int sumOfLengths = 0;
        for (String s : list) {
            sumOfLengths += s.length();
        }
        return Math.round(sumOfLengths / list.size());
    }

    public static boolean isValid(String word) {
        List<Character> vowel = new ArrayList<>(Arrays.asList('а', 'и', 'е', 'е', 'о', 'у', 'ы', 'э', 'ю', 'я'));
        List<Character> characterList = word.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> unrepeteable = characterList.stream().distinct().filter(vowel::contains).collect(Collectors.toList());
        if (unrepeteable.size() >= 5)
            return true;
        else
            return false;
    }

    public static List<Integer> findPositions(List<String> list, String input) {
        int index = 0;
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(input))
                index = i;
            positions.add(index);
        }
        positions = positions.stream()
                .distinct()
                .collect(Collectors.toList());
        for (Integer i : positions) {
            i++;

        }
        return positions;
    }


    public static void countMapTreeMap(List<String> list) {
        Map<String, Integer> treeMap = new TreeMap<>();
        list.forEach(s -> {
            if (!treeMap.containsKey(s)) {
                treeMap.put(s, 1);
            } else
                treeMap.put(s, treeMap.get(s) + 1);
        });

        treeMap.entrySet().forEach(System.out::println);
    }


    public static int countWords(List<String> list, String input) {
        int counter = 0;
        for (String s : list) {
            splittedList = Arrays.asList(s.split(" "));
            for (String string : splittedList) {
                if (input.equals(string))
                    counter++;
            }

        }
        return counter;
    }
}