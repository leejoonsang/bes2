package week3.day3.collection;

public class Student {

    private int classNum;
    private String name;
    private String gitRepoAddress;

    public Student(int classNum, String name, String gitRepoAddress) {
        this.classNum = classNum;
        this.name = name;
        this.gitRepoAddress = gitRepoAddress;
    }

    public String toString() {
        return classNum + " " + name + " " + gitRepoAddress;
    }

}
