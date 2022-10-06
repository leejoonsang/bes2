package week3.day4.collection;

import week3.day3.calculator.NumberCreator;

public class RandNumCreator implements NumberCreator {
    @Override
    public int create(int num) {
        return (int)(Math.random() * num);
    }
}
