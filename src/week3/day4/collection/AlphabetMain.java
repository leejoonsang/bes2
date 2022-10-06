package week3.day4.collection;

import java.util.HashSet;
import java.util.Set;

public class AlphabetMain {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            char random = (alphabetGenerator.generate(65));
            set.add(random);
        }

        for (Character s : set) {
            System.out.println(s);
        }

    }
}

