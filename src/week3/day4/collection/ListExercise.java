package week3.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("이상준");
        this.students.add("ㅁㅁㅁ");
        this.students.add("박멋사");
        this.students.add("ㅇㅇㅇ");
        this.students.add("김철수");
    }

    public List<String> names(){
        return this.students;
    }

}
