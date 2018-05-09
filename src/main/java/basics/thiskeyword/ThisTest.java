package basics.thiskeyword;

public class ThisTest {

    int x=10;
    public void assign(int x){
        x=x;
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new ThisTest().assign(100);
    }
}
