package DesignPattern.CommandPattern;

/**
 * Created by john on 2017/10/2.
 */
public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock){
        this.stock =stock;
    }
    @Override
    public void execute() {
         stock.sell();
    }
}
