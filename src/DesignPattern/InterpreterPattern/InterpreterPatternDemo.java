package DesignPattern.InterpreterPattern;

/**
 * Created by john on 2017/10/2.
 */
public class InterpreterPatternDemo {
    public static Expression getMaleExpression(){
        TerminalExpression terminalExpression1=new TerminalExpression("John");
        TerminalExpression terminalExpression2=new TerminalExpression("Jack");
        return new OrExpression(terminalExpression1,terminalExpression2);
    }
    public static Expression getMarriedFemaleExpression(){
        TerminalExpression terminalExpression=new TerminalExpression("Andy");
        TerminalExpression terminalExpression1=new TerminalExpression("Married");
        return new AndExpression(terminalExpression1,terminalExpression);
    }
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedFemale = getMarriedFemaleExpression();

        System.out.println("MOyan is male? " + isMale.interpret("MOyan"));
        System.out.println("Julie is a married women? "
                + isMarriedFemale.interpret("Married Andy"));
    }
}
