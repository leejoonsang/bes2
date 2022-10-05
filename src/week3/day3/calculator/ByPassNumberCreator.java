package week3.day3.calculator;

public class ByPassNumberCreator implements NumberCreator{
    @Override
    public int create(int num) {
        return num;
    }

}
