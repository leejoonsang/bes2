package week3.day4.collection;

import java.util.HashMap;

public class AlphabetCntMain {
    public static void main(String[] args) {

        //모두 대문자로 변경
        String s1 = "https://github.com/leejoonsang/bes2".toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        //hash map 초기화.
        for(char c = 'A'; c < 'Z'+ 1 ; c++){
            alphabetMap.put(c,0);
        }

        //string 한글자 씩 출력
        for(int idx = 0; idx < s1.length(); idx++) {
            char c = s1.charAt(idx);
            boolean isAlphabet = AlphabetCnt.isAlphabet(c);

            if(isAlphabet){
                alphabetMap.put(c, alphabetMap.get(c)+1);
            }
        }
        System.out.println(alphabetMap);

    }

}
