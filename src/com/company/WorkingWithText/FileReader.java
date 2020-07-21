package com.company.WorkingWithText;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private static String url = "/Users/andrey/Desktop/IdeaProjects/streamsExperience/src/com/company/WorkingWithText/warAndPeace.txt";
    static List<String> splittedList;

    FileReader() {
    }

    public FileReader(List<String> list) throws IOException {
        splittedList = list;
        Scanner scanner = new Scanner(new File(url));
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
    }

    public static String getUrl() {
        return url;
    }
}
