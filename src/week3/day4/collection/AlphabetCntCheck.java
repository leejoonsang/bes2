package week3.day4.collection;

public class AlphabetCntCheck {
    private String s1;
    public AlphabetCntCheck(String s1) {
        this.s1 = s1;
    }
    public void isAlphabet(String s) {

        int cnt = 0;

        if(s == null){
            System.out.println("문자열이 비었습니다.");
        }
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            if((c1 >= 'A' && c1 <= 'Z')) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
