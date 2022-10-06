package week3.day4.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    char readOneByte (String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 1024);
        return (char)br.read();
    }

    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFile("");
        //char c = readFile.readOneByte();
        File file = new File("./a_file.txt");
        file.createNewFile();

        System.out.println(readFile.readOneByte("./a_file.txt"));

    }
}
