package DesignPattern.VisitorPattern;

/**
 * Created by john on 2017/10/3.
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
