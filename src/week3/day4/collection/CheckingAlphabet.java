package week3.day4.collection;

public class CheckingAlphabet {
    public boolean isAlphabet(String s) {

        if(s == null){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            if(!(c1 >= 'A' && c1 <= 'Z') && !(c1 >= 'a' && c1 <= 'z')){
                return false;
            }

        }
        return true;
    }
}
