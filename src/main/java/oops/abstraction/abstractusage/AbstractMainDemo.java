package oops.abstraction.abstractusage;

/**
 * Created by Ashutosh on 12-11-2017.
 */
public class AbstractMainDemo {

    public static void main(String[] args) {

        //You cannot Create a object of Abstract Class ,uncomment below to see the error
        //CarBase carBase=new CarBase(){};

        CarBase carBase = new CarBaseModelAImpl("****Aspire****");
        carBase.printModelName();
        carBase.headLamp();
        carBase.gears();
        carBase.horn();
        carBase.musicSystem();
        carBase.airBags(); //Empty body
        System.out.println(carBase.gear);
        //carBase.specialModelAmethod(); This wont work.By design you should only implement all methods of Abstract class and class should be closed for modification


        System.out.println("=================================");

        //Same as above ,but the reference variable is fo the same concrete class
        CarBaseModelAImpl carBaseModelA = new CarBaseModelAImpl("****Swift****");
        carBaseModelA.printModelName();
        carBaseModelA.headLamp();
        carBaseModelA.gears();
        carBaseModelA.horn();
        carBaseModelA.musicSystem();
        carBaseModelA.airBags(); //Empty body
        System.out.println(carBase.gear);
        carBaseModelA.specialModelAmethod();//This works

        System.out.println("=================================");

        //Reference of Abstract and impl of Model B
        carBase = new CarBaseModelBImpl("****Figo****");
        carBase.printModelName();
        carBase.headLamp();
        carBase.gears();
        carBase.horn();
        carBase.musicSystem();
        carBase.airBags(); //Empty body
        System.out.println(carBase.gear);


    }
}
