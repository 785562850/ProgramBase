package DesignPattern.VisitorPattern;

/**
 * Created by john on 2017/10/3.
 */
public class Computer implements ComputerPart{
    ComputerPart[] parts;
    public Computer(){
        parts=new ComputerPart[]{new Monitor(),new Monitor(),new KeyBoard()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part:parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
