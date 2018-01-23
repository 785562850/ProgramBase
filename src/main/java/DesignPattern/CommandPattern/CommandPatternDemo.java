package DesignPattern.CommandPattern;

/**
 * Created by john on 2017/10/2.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock Stock = new Stock();

        BuyOrder buyStockOrder = new BuyOrder(Stock);
        SellOrder sellStockOrder = new SellOrder(Stock);

        OrderBroker broker = new OrderBroker();
        broker.addOrder(buyStockOrder);
        broker.addOrder(sellStockOrder);

        broker.executeOrders();
    }
}
