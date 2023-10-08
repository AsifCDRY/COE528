package coe528lab1;

/**
 *
 * @author a35choud
 */
public class Member extends Passenger{
    private int yearsOfMembership;

    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    @Override
    public double applyDiscount(double p){
        if(yearsOfMembership > 5)
            p = p*0.5;
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5)
            p = p*0.9;
        return p;
    }
}
