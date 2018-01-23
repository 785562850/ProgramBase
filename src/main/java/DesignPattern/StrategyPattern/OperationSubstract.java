package DesignPattern.StrategyPattern;

/**
 * Created by john on 2017/10/3.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
