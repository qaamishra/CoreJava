package basics.instanceOf;

class A
{
    void method1(int a, int b)
    {
        System.out.println("a + b is : "+ (a+b));
    }

}
class B
{
    void method1(int a, int b)
    {
        System.out.println("a + b  is : "+ (a+b));
    }

}
class InstanceOf
{

    public static void main(String args[])
    {
        A a = new A();
        a.method1(5,6);
        B b = new B();
        b.method1(5,6);

        if(a instanceof A)
            System.out.println("a is instance of A");
        if(b instanceof B)
            System.out.println("c is instance of C");
    }

}
