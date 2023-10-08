package coe528lab4;

/**
 *
 * @author Asif Choudhury, 501111719
 */
public abstract class FoodComponent {
    private String foodName;
    private double price;
    
    public FoodComponent(String foodName, double price){
        this.foodName = foodName;
        this.price = price;
    }
    
    public FoodComponent(String foodName){
        this.foodName = foodName;
    }
    
    public abstract double getPrice();
    public abstract void print(int level);
}
