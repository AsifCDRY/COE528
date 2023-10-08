package coe528lab4;
import java.util.ArrayList;

/**
 *
 * @author Asif Choudhury
 */
public class FoodCategory extends FoodComponent {
    private String category;
    private ArrayList<FoodComponent> foodArr;
    
    public FoodCategory(String category){
        super(category);
        foodArr = new ArrayList<FoodComponent>();
        this.category = category;
    }
    
    public void add(FoodComponent f){
        foodArr.add(f);
    }
    
    public void remove(FoodComponent f){
        if(foodArr.contains(f))
            foodArr.remove(f);
        else
            System.out.println("Food Item does not exist in the list");
    }
    
    @Override
    public double getPrice(){
        double categoryPrice = 0;
        for(FoodComponent i : foodArr){
            categoryPrice += i.getPrice();
        }
        return categoryPrice;
    }
    
    @Override
    public void print(int level){
        
        //Tabs the output depending on the level number
        for(int j = 0; j < level; j++)
            System.out.print("\t");
        System.out.println("Food Category (" + category + ", " + this.getPrice() + ") contains:");
        
        //Calls the print method depending on if 'i' is a FoodCategory or FoodItem
        for(FoodComponent i : foodArr)
            i.print(level+1);
    }
}
