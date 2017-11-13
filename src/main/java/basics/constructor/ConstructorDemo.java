package basics.constructor;

class ConstructorDemo {
    int value1;
    int value2;

    ConstructorDemo() {
        value1 = 10;
        value2 = 20;
        System.out.println("Inside Constructor");
    }

    public void display() {
        System.out.println("Value1 === " + value1);
        System.out.println("Value2 === " + value2);
    }

    public static void main(String args[]) {
        ConstructorDemo d1 = new ConstructorDemo();
        d1.display();
    }
}
