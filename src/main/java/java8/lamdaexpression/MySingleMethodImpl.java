package java8.lamdaexpression;

public class MySingleMethodImpl {

    public static void main(String[] args) {

                                        //parameters -> return type - function (logic)
        MySingleMethod addition = (int a,int b)-> System.out.println(a+b);
        addition.numOperation(2,4);

        MySingleMethod substraction = (int a,int b)-> System.out.println(a-b);
        substraction.numOperation(2,4);

        MySingleMethod multiplication = (int a,int b)-> System.out.println(a*b);
        multiplication.numOperation(2,4);



    }
}
