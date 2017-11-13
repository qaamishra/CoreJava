package basics.regularexpression;


public class StringPatternMatch {
    public static void main(String args[]) {
        String Str = new String("konylabsinterview");

        System.out.print("Return Value :");
        System.out.println(Str.matches("(.*)Tutorials(.*)"));

        System.out.print("Return Value :");
        System.out.println(Str.matches("kon(.*)lab(.*)terview(.*)"));

        System.out.print("Return Value :");
        System.out.println(Str.matches("Welcome(.*)"));
    }
}
