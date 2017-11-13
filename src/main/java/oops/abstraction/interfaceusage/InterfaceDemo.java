package oops.abstraction.interfaceusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class InterfaceDemo {

    public static void main(String[] args) {

        //If you would have taken concrete class as reference variable you could not have a common methods and any change will have bigger code impact
        AnimalBase animalBase;


        animalBase = new CowAnimalBaseImpl();
        new InterfaceDemo().runCommonMethods(animalBase);

        animalBase = new DogAnimalBaseImpl();
        new InterfaceDemo().runCommonMethods(animalBase);

        animalBase = new EagleAnimalBaseImpl();
        new InterfaceDemo().runCommonMethods(animalBase);

    }

    public void runCommonMethods(AnimalBase animalBase) {
        System.out.println("=============================" + animalBase.getClass().toGenericString());
        animalBase.speak();
        animalBase.fly();
        animalBase.landSpeed();
        animalBase.foodHabit();
    }


}
