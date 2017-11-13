package oops.abstraction.abstractusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class CarBaseModelBImpl extends CarBase {

    public CarBaseModelBImpl(String modelName) {
        super(modelName);
    }

    //Observe airBags is not in the implemented methods
    @Override
    public void headLamp() {

        System.out.println("LED");
    }

    @Override
    public void gears() {

        System.out.println("Automatic");
    }

    @Override
    public void horn() {

        System.out.println("Trance");

    }


}
