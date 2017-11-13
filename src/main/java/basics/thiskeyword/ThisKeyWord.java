package basics.thiskeyword;

public class ThisKeyWord {
    int a;
    int b;

    public void setData(int a, int b) {
        a = a;
        b = b;
        //this.a = a;
        //this.b = b;

    }

    public void showData() {
        System.out.println("Value of A =" + a);
        System.out.println("Value of B =" + b);
    }


}