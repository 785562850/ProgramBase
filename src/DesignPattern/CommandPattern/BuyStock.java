package DesignPattern.CommandPattern;

/**
 * Created by john on 2017/10/2.
 */
public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
