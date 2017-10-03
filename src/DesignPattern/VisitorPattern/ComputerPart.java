package DesignPattern.VisitorPattern;

/**
 * Created by john on 2017/10/3.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
