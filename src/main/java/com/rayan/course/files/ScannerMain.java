package com.rayan.course.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by saeed on 2/16/16.
 */
public class ScannerMain {

    public static final String STR_BUILD = "<build>";

    public static void main(String[] args) {

        try (
                Scanner scanner = new Scanner(new BufferedReader(new FileReader("pom.xml")));
                Formatter formatter = new Formatter("pom.txt");
        ) {
            scanner.useDelimiter(STR_BUILD);

            formatter.format("%s",scanner.next());
            formatter.format("%s", STR_BUILD + "Hello Word!");
            formatter.format("%s", scanner.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
