package oops.polymorphism.dynamicruntime.methodoverrding;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class Sbi extends Bank {

    @Override
    public double getRateOfInterest() {
        return 7.5;
    }

    public void specialSBIMethod() {
        System.out.println("Special SBI Method");
    }
}
