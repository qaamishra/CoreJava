package oops.abstraction.interfaceusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class CowAnimalBaseImpl implements AnimalBase {
    @Override
    public void speak() {
        System.out.println(" Loud voice");
    }

    @Override
    public void fly() {
        System.out.println("Cant Fly");
    }

    @Override
    public void landSpeed() {
        System.out.println("Very Slow");
    }

    @Override
    public void foodHabit() {
        System.out.println("Herbivorous");
    }
}
