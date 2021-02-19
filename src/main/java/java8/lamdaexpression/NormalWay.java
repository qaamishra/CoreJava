package java8.lamdaexpression;

public class NormalWay {
    public static void main(String[] args) {

        MySingleMethod mySingleMethod= new MySingleMethod() {
            @Override
            public void numOperation(int x, int y) {
                System.out.println(x+y);
            }
        };

        mySingleMethod.numOperation(2,3);
    }
}
