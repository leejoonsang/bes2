package week3.day4.file;

import java.io.IOException;

public class FileExercise1Main {
    public static void main(String[] args) throws IOException {

        String filename = "/Users/sangjoonlee/Desktop/input/temp.txt";
        FileExercise1 fileExercise1 = new FileExercise1(filename);

        System.out.println(fileExercise1.readALine(filename));
    }
}

/*
2021년도 고속국도 제25호 호남선(김제~삼례) 확장공사 타당성평가 및 기본설계용역 과업내용서
 */