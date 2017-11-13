package oops.polymorphism.dynamicruntime.methodoverrding;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class MethodOverriding {

    public static void main(String[] args) {

        Bank bank;

        //Simple Parent class
        bank = new Bank();
        System.out.println(bank.getClass().toGenericString());
        System.out.println(bank.getRateOfInterest());

        //Parent class reference child object which has same method and overridden
        bank = new Sbi();
        System.out.println(bank.getClass().toGenericString());
        System.out.println(bank.getRateOfInterest());


        bank = new Hdfc();
        System.out.println(bank.getClass().toGenericString());
        System.out.println(bank.getRateOfInterest());


        //If a child class contains a its own specific method,in our case check Sbi class ,it cannot be called by the reference variable of Parent and will result in complie time error
        bank = new Sbi();
        System.out.println(bank.getClass().toGenericString());
        System.out.println("Below is compile time error -Uncomment to see");
        //bank.specialSBIMethod(); //-->Compile time error

        Sbi sbi = new Sbi();
        System.out.println(bank.getClass().toGenericString());
        System.out.println(sbi.getRateOfInterest());
        sbi.specialSBIMethod();


    }
}
