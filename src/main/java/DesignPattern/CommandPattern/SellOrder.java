package DesignPattern.CommandPattern;

/**
 * Created by john on 2017/10/2.
 */
public class SellOrder implements Order{
    private Stock stock;

    public SellOrder(Stock stock){
        this.stock =stock;
    }
    @Override
    public void execute() {
         stock.sell();
    }
}
