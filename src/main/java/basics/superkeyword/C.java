package basics.superkeyword;

public class C extends B {

    public void test() {
        super.test();
        System.out.println("In class C");
    }


    public static void main(String[] args) {

        C c = new C();
        c.test();

    }

}
//A B C are combined one example