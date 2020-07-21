package com.company.MyUtils;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;


public class Utils {

    public static Comparator<Integer> stringComparator = (integer1, integer2) -> {
        if (integer1 > integer2) {
            return integer1;
        }
        return integer2;
    };


    public static void streamSortIntegers(List<Integer> integers) {
        List<Integer> collect = integers
                .parallelStream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void  streamSortStrings(List<String> strings) {
        List<String> sorted =  strings
                .parallelStream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    public static Set<BigInteger> filtrationForRange(List<Integer> list, int from, int to) {
        return list.stream()
                .filter(x -> x > from && x < to)
                .map(BigInteger::valueOf)
                .collect(Collectors.toSet());
    }

    public static List<String> reverse(List<String> list) {
        return list.stream()
                .filter(str -> {
                    String removed = str.replaceAll("o", "");
                    return str.length() - removed.length() >= 2;
                })
                .map(str -> {
                            StringBuilder sb = new StringBuilder();
                            return sb.append(str).reverse().toString();
                        }
                )
                .collect(Collectors.toList());
    }
}


