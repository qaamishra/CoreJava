package basics.classforname;

public class InterfaceImpl implements MyInterface {


    public void add() {
        System.out.println("Addition");

    }


    public void subtarct() {
        System.out.println("Subtraction");

    }


    public void multiply() {

        System.out.println("Multiplication");
    }


    public static void main(String[] args) throws Exception {

        try {
            Class c = Class.forName("com.InterfaceTest.InterfaceImpl");
            MyInterface i = (MyInterface) c.newInstance();

            i.add();
            i.subtarct();
            i.multiply();

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }

}

	

