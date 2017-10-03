package DesignPattern.NullObjectPattern;

/**
 * Created by john on 2017/10/2.
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name) {
        this.name = name;
    }
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
