package coe528lab4;

/**
 *
 * @author Asif Choudhury, 501111719
 */
public class FoodItem extends FoodComponent {
    private String foodName;
    private double foodPrice;
    
    public FoodItem(String name, double price){
        super(name, price);
        foodName = name;
        foodPrice = price;
    }
    
    @Override
    public double getPrice(){
        return foodPrice;
    }
    
    @Override
    public void print(int level){
        
        //Tabs the output depending on the level number
        for(int j = 0; j < level; j++)
            System.out.print("\t");                    
        System.out.println("Food Item: " + foodName + ", " + this.getPrice());
    }
}
