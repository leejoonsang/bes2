package week3.day4.collection;

import java.util.HashMap;

public class AlphabetCntMain {
    public static void main(String[] args) {
        HashMap<String, Integer> alphabetMap = new HashMap<>();
        String s1 = "aabb!@ccd$%^deef^^fg@*^ghh^(i(ijj".toUpperCase();

        AlphabetCntCheck acc = new AlphabetCntCheck(s1);
        acc.isAlphabet(s1);

//        for(int i=0; i<s1.length(); i++){
//            System.out.println(s1.charAt(i));
//        }

    }

}
