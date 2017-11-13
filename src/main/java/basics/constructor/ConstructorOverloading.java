package basics.constructor;

class ConstructorOverloading {
    int value1;
    int value2;

    //Constructor #1
    ConstructorOverloading() {
        value1 = 10;
        value2 = 20;
        System.out.println("Inside 1st Constructor");
    }

    //Constructor #2
    ConstructorOverloading(int a) {
        value1 = a;
        System.out.println("Inside 2nd Constructor");
    }

    //Constructor #3
    ConstructorOverloading(int a, int b) {
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");
    }

    public void display() {
        System.out.println("Value1 === " + value1);
        System.out.println("Value2 === " + value2);
    }

    public static void main(String args[]) {
        ConstructorOverloading d1 = new ConstructorOverloading();
        ConstructorOverloading d2 = new ConstructorOverloading(30);
        ConstructorOverloading d3 = new ConstructorOverloading(30, 40);
        d1.display();
        d2.display();
        d3.display();
    }
}
