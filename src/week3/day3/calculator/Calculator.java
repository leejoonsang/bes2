package week3.day3.calculator;

public class Calculator {
    private int baseNum;
    NumberCreator numberCreator;

    public Calculator(NumberCreator numberCreator){
        this.numberCreator = numberCreator;
        this.baseNum = 10;
    }

    public Calculator(NumberCreator numberCreator, int baseNum) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public void plus(int num) {
        System.out.println(num + numberCreator.create(baseNum));
    }

}
