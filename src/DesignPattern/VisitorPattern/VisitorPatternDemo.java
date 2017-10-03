package DesignPattern.VisitorPattern;

/**
 * Created by john on 2017/10/3.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
