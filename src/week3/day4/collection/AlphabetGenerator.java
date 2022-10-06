package week3.day4.collection;

public class AlphabetGenerator implements Generator<Character>{
    @Override
    public Character generate(int num) {
        int randNum = (int) (Math.random() * 26);
        char alphabet = (char) (randNum + 65);
        return alphabet;
    }
}
