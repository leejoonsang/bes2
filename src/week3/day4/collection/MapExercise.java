package week3.day4.collection;

import java.util.HashMap;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("이상준", "https://github.com/leejoonsang/bes2");
        map.put("권하준", "https://github.com/dongyeon-0822/java-project-exercise");
        map.put("조성윤", "https://github.com/KoKwanwun/LikeLion.git");
        map.put("안예은", "https://github.com/cmkxak/likelion-java-course");
        map.put("남우빈", "https://github.com/percyfrank/like-lion");
        map.put("최경민", "https://github.com/KimGunWoo9595/Lion_Java_Pratice");
        map.put("안준휘", "https://github.com/pi22-a/git_practice.git");
        map.put("하채민", "https://github.com/simhyunbo/git-exercise-04.git");
        map.put("허도한", "https://github.com/coastby/java-project");
        map.put("배태훈", "https://github.com/k0605ja/git-test");

        System.out.println(map.entrySet());

    }
}
