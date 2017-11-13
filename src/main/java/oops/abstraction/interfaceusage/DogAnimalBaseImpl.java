package oops.abstraction.interfaceusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class DogAnimalBaseImpl implements AnimalBase {
    @Override
    public void speak() {
        System.out.println("I bark");
    }

    @Override
    public void fly() {

        System.out.println("Cant Fly");
    }

    @Override
    public void landSpeed() {

        System.out.println("30km/h");
    }

    @Override
    public void foodHabit() {
        System.out.println("Carnivorous");
    }
}
