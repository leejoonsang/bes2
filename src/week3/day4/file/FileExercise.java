package week3.day4.file;

import java.io.FileReader;
import java.io.IOException;

public class FileExercise {

    // 현재 디렉토리 파일 목록 출력
//    public void printFiles(){
//        File dir = new File("./");
//        File files[] = dir.listFiles();
//
//        for (File week3.day4.file : files) {
//            System.out.println(week3.day4.file);
//        }
//    }

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

    // n글자씩 읽어오는 메소드
    public String readNChars(String filename, int n) throws IOException {
        FileReader fileReader = new FileReader(filename);
        int c = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            if ((c = fileReader.read()) == -1)
                break;
            str += (char) c;
        }
        return str;
    }
    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise();

        char c = fileExercise.readAChar("./b_file.txt");
        String str = fileExercise.readTwoChars("./b_file.txt");
        String str1 = fileExercise.readNChars("./b_file.txt", 15);
        System.out.println(c);
        System.out.println(str);
        System.out.println(str1);

    }
}

/*
F
Fi
File Reading Te
 */