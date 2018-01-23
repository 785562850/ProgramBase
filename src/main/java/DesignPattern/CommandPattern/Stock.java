package DesignPattern.CommandPattern;

/**
 * Created by john on 2017/10/2.
 */
public class Stock {
    private String name="moyan";
    private int quantity=10;
    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: "
                + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",  Quantity: "
                + quantity +" ] sold");
    }
}
