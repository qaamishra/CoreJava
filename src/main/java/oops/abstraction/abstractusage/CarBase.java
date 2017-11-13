package oops.abstraction.abstractusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
abstract public class CarBase {

    //Here I know except the music system ,everything else would be changing

    int gear = 5;
    String modelName;

    public CarBase(String modelName) {
        this.modelName = modelName;
    }

    protected CarBase() {
    }

    abstract public void headLamp();

    abstract public void gears();

    abstract public void horn();

    public void printModelName() {
        System.out.println(modelName);
    }

    public void musicSystem() {

        System.out.println("We have only one vendor and All models of our car company should have BOSE music system");
    }

    //This method has a body but I can leave it empty ,thiskeyword does not mean its abstract
    public void airBags() {

    }

}
