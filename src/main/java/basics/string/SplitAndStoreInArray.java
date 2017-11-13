package basics.string;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitAndStoreInArray {

    public static void main(String[] args) {

        String machine = "abcd,pqrst";
        ArrayList<String> machineAL = new ArrayList<String>(Arrays.asList(machine.split(",")));

        System.out.println(machineAL.toString());
        ;

    }
}
