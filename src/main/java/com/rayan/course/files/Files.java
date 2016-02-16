package com.rayan.course.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by saeed on 2/16/16.
 */
public class Files {

    public static void main(String[] args) {


        try (
                FileInputStream in = new FileInputStream("pom.xml");
                FileOutputStream out = new FileOutputStream("pom.txt")
        ) {

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
