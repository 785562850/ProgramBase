package DesignPattern.CommandPattern;

import com.sun.corba.se.pept.broker.Broker;

/**
 * Created by john on 2017/10/2.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock Stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(Stock);
        SellStock sellStockOrder = new SellStock(Stock);

        OrderBroker broker = new OrderBroker();
        broker.addOrder(buyStockOrder);
        broker.addOrder(sellStockOrder);

        broker.executeOrders();
    }
}
