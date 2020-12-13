package basics.thiskeyword;

public class ThisAsMethodParameter {
    int i;

    void method() {
        method1(this);
    }

    void method1(ThisAsMethodParameter t) {
        System.out.println(t.i);
    }

    public static void main(String[] args) {
        ThisAsMethodParameter obj = new ThisAsMethodParameter();
        obj.i = 10;
        obj.method();
    }
}

