package week3.day4.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise1 {

    public FileExercise1(String filename){}

    public static String readALine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String strLine = br.readLine();

        return strLine;
    }
}
