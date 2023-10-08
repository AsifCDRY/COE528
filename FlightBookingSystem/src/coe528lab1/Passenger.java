package coe528lab1;

/**
 *
 * @author a35choud
 */
abstract class Passenger {
    protected String name;
    protected int age;
    
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        if(age < 0)
            throw new IllegalArgumentException("Please enter a valid age");
        else
            this.age = age;
    }
    
    public abstract double applyDiscount(double p);
}
