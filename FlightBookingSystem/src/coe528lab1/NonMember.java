package coe528lab1;

/**
 *
 * @author a35choud
 */
public class NonMember extends Passenger{
    public NonMember(String name, int age) {
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p){
        if(age > 65)
            p = p*0.9;
        return p;
    }
}
