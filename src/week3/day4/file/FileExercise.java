package week3.day4.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    // 1글자씩 읽어오는 메서드
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    // 2글자씩 읽어오는 메서드
    public String readTwoChars(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }
    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise();
        char c = fileExercise.readAChar("./a_file.txt");
        String str = fileExercise.readTwoChars("./a_file.txt");
        System.out.println(c);
        System.out.println(str);

    }
}

/*
H
He
 */