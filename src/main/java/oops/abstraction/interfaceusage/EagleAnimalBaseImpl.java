package oops.abstraction.interfaceusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class EagleAnimalBaseImpl implements AnimalBase {
    @Override
    public void speak() {
        System.out.println("sharp noise");
    }

    @Override
    public void fly() {
        System.out.println("can fly");
    }

    @Override
    public void landSpeed() {
        System.out.println("2km/h");

    }

    @Override
    public void foodHabit() {
        System.out.println("Carnivorous");
    }
}
