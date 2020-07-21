package com.company;


import java.io.IOException;
import java.util.*;

import com.company.MyUtils.Utils;
import com.company.SomOperations.EasyOperations;
import com.company.WorkingWithText.Demonstrate;
import com.company.WorkingWithText.FileReader;

import static java.lang.System.in;
import static java.lang.System.out;


public class Main {
    private static final String url = "/Users/andrey/Desktop/IdeaProjects/streamsExperience/src/com/company/WorkingWithText/warAndPeace.txt";
    private static Scanner scanner;
    private static final String delimiterForPrograms = "----------------------------------------------------------------------------------------";
    private static final String delimiterForProjects = "=========================================================================================";


    public static void main(String[] args) throws IOException {
        out.println(delimiterForProjects);
        out.println("Easy stream");

        out.println("We have the list of double numbers: ");
        List<Double> listOfDouble = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        listOfDouble.forEach(out::println);

        out.println("Added 1 to each number and casted to the Integer: ");
        EasyOperations.plusOne(listOfDouble).forEach(out::println);

        System.out.println(delimiterForProjects);
        System.out.println();

        out.println("Demonstration of parsing with stream");
        String string = "abppplee";
        out.println("We have string with repeated letters: " + string);
        out.println("Delete them using stream function: " + EasyOperations.deleteRepeats(string));

        System.out.println(delimiterForPrograms);
        System.out.println();

        out.println("We have a list of strings: ");
        List<String> listOfStrings = new ArrayList<>(Arrays.asList("able", "ale", "apple", "bale", "kangaroo"));
        listOfStrings.forEach(out::println);
        out.println("Convert it to list of arrays of char: ");
        List<char[]> splittedArray = EasyOperations.splitToCharArray(listOfStrings);
        for (char[] array : splittedArray) {
            out.println(array.toString());
        }
        System.out.println(delimiterForPrograms);
        System.out.println();

        out.println("We have an array of Integers");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 22, 93));
        numbers.forEach(out::println);
        out.println("Now we have the last digit of numbers: ");
        EasyOperations.printTheLastValue(numbers);


        out.println(delimiterForProjects);
        out.println();

        List<String> warAndPeace = new ArrayList<>();

        Demonstrate demonstrate = new Demonstrate(new FileReader(warAndPeace));

        out.println(warAndPeace);

        out.println("Showing the length of max string");
        out.println(Demonstrate.maxLength(warAndPeace));
        out.println(Demonstrate.maxLengthFeature(warAndPeace));
        out.println(Demonstrate.maxLengthFeature2(warAndPeace));
        out.println(delimiterForPrograms);
        out.println();
        out.println("Demonstrates you the length of the average string");
        out.println(Demonstrate.averageString(warAndPeace));
        out.println(delimiterForPrograms);
        out.println(" ");
        String need = "надо";
        out.println("Returns the positions of the input word " + need + " : ");
        System.out.println(Demonstrate.findPositions(warAndPeace, need) + " ");
        System.out.println(delimiterForPrograms);
        System.out.println();
        out.println("Counts the number of repetitions of each word");
//        Demonstrate.countMapTreeMap(warAndPeace);
        out.println(delimiterForPrograms);
        out.println();
        out.println("Returns the frequency of a word " + need + " : ");
        out.println(Demonstrate.countWords(warAndPeace, "надо"));
        out.println(delimiterForProjects);
        out.println();

        out.println("We have the integer list: ");
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 41, 78, 42, 54, 25));
        out.println("We sorted it using streams, now we have: ");
        Utils.streamSortIntegers(integers);
        out.println(delimiterForPrograms);
        out.println();

        out.println("We have the list of strings: ");
        List<String> strings = new ArrayList<>(Arrays.asList("cat", "dog", "lalla", "120941uirjlfsak", "andrew"));
        out.println("We sorted it using streams, now we have: ");
        Utils.streamSortStrings(strings);
        out.println(delimiterForPrograms);
        out.println();


        String firstString = "Small penaut";
        String secondString = "Kind brick";
        out.println("We compare 2 strings: " + firstString + " "
                + secondString + " by their length the first is greater than the second: ");
        out.println(Utils.isGreaterThan(firstString, secondString));
        out.println(delimiterForPrograms);
        out.println();

        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,15,16,14,29,45,67,90));
        out.print("We have the list of numbers: " + listOfNumbers);
        out.println();
        out.print("Filter and print it: ");
        out.println(Utils.filtrationForRange(listOfNumbers, 12, 19));
        out.println(delimiterForPrograms);
        out.println();

        out.println();
        List<String> listOfWords = new ArrayList<>(Arrays.asList("Spring, Autumn, Summer, Winter"));
        listOfWords.forEach(out::println);
        out.println(Utils.reverse(listOfStrings));

    }
}