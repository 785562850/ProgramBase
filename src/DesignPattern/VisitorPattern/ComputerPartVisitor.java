package DesignPattern.VisitorPattern;

/**
 * Created by john on 2017/10/3.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(KeyBoard keyboard);
    public void visit(Monitor monitor);
}
