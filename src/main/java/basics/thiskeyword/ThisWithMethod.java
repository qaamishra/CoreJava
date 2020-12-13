package basics.thiskeyword;

public class ThisWithMethod {

    public static void main(String[] args) {
        ThisWithMethod obj = new ThisWithMethod();
        obj.methodTwo();
    }

    void methodOne() {
        System.out.println("Inside Method ONE");
    }

    void methodTwo() {
        System.out.println("Inside Method TWO");
        this.methodOne();// same as calling methodOne()
    }

}
