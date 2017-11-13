package oops.abstraction.abstractusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class CarBaseModelAImpl extends CarBase {


    public CarBaseModelAImpl(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void headLamp() {

        System.out.println("Plain Yellow");
    }

    @Override
    public void gears() {

        System.out.println("Manual");
    }

    @Override
    public void horn() {

        System.out.println("Harmony");

    }

    //This was not a abstract method ,how ever we are overriding it
    public void airBags() {
        System.out.println("Only Model A comes with airBags");
    }

    public void specialModelAmethod() {

        System.out.println("My color is only RED");
    }


    int gear = 6;


}
