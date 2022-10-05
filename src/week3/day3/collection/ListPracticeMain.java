package week3.day3.collection;

import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();
        List<Student> studentObjs = likeLion2th.getStudentObjs();

        for(String student : students){
            System.out.println(student);
        }
        System.out.println("학생 수: " + students.size());

        for(int i=0; i<studentObjs.size(); i++){
            System.out.println(studentObjs.get(i));
        }


    }
}
