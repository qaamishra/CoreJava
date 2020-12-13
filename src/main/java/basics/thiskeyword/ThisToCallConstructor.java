package basics.thiskeyword;

public class ThisToCallConstructor {

    ThisToCallConstructor() {
        this("JBT");
        System.out.println("Inside Constructor without parameter");
    }

    ThisToCallConstructor(String str) {
        System.out
                .println("Inside Constructor with String parameter as " + str);
    }

    public static void main(String[] args) {
        ThisToCallConstructor obj = new ThisToCallConstructor();
    }
}
