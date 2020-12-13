package basics.thiskeyword;

public class ThisTest {

    int x=10;

    public void assign(int x){
        System.out.println("x : "+x);
        System.out.println("This X: "+this.x);//try print x to see the difference
    }

    public static void main(String[] args) {
        new ThisTest().assign(100);
    }
}
