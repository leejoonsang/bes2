package week3.day4.collection;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.names();

        for(String s : students){
            System.out.println(s);
        }
        System.out.println("학생 수: " + students.size());
    }
}
