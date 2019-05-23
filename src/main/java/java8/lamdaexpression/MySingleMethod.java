package java8.lamdaexpression;

//An interface with single abstract method is called functional interface
public interface MySingleMethod {

    public void numOperation(int x, int y);

    //If you Uncomment the below line you will find the compile time error in  MySingleMethodImpl.java
    //public int numMultiplication();

    default void normalFun()
    {
        System.out.println("Hello");
    }
}
