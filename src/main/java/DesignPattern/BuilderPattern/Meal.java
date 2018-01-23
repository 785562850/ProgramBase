package DesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/10/1.
 */
public class Meal {
    private List<Item> items=new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getPrice(){
        float cost=0.0f;
        for (Item item: items) {
            cost+=item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item: items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().Pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
