package week3.day3.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.students = names.names();
        this.studentObjs = names.getStudentObjs();
    }

    // 멋쟁이사자처럼 2기 학생의 이름이 담겨있는 List를 리턴하는 메서드
    public List<String> getStudentList(){
        return this.students;
    }

    public List<Student> getStudentObjs() {
        return this.studentObjs;
    }
}
