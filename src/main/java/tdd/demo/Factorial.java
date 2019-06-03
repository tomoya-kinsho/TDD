package tdd.demo;

public class Factorial {
    public int calculate(int inputValue) {
        if(inputValue < 1 || inputValue > 10) return -1;
        if(inputValue == 1) return 1;
        return inputValue * calculate(inputValue - 1);
    }
}
