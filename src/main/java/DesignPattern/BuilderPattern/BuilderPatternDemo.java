package DesignPattern.BuilderPattern;

/**
 * Created by john on 2017/10/1.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.getChickenMeal();
        System.out.println("Chicken Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getPrice());

        Meal nonVegMeal = mealBuilder.getBeefMeal();
        System.out.println("\n\nBeef Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getPrice());
    }
}
