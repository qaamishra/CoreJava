package basics.incrementoperator;

//Difference between post increment (n++) and pre increment(++n)
//*******Post Increment(n++) : First execute the statement then increase the value by one.*******
//*******Pre Increment (++n) : First increase the value by one then execute the statement.*******

public class IncrementTest {
    public static void main(String[] args) {

        System.out.println("***Post increment test***");
        int n = 10;
        System.out.println(n);      // output  10
        System.out.println(n++);    // output  10
        System.out.println(n);      // output  11

        System.out.println("***Pre increment test***");
        int m = 10;
        System.out.println(m);      // output  10
        System.out.println(++m);    // output  11
        System.out.println(m);      // output  11
    }
}