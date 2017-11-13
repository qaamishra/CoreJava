package basics.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessExistenceTest {

    public static void main(String[] args) throws IOException {

        ProcessExistenceTest pt = new ProcessExistenceTest();
        //mspaint.exe
        //NeoLoadCMD.exe
        //java.exe
        //NeoLoadCMD.exe
        //eclipse.exe
        String processName = "eclipse.exe";
        boolean result = pt.isProcessExist(processName);

        if (result == true) {
            System.out.println(processName + "  Process  Exist ");
        } else {
            System.out.println(processName + "Process doesnt Exist ");
        }


    }

    public boolean isProcessExist(String Pname) throws IOException {
        String line;
        String pidInfo = "";

        Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");

        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while ((line = input.readLine()) != null) {
            pidInfo += line;
        }

        input.close();

        if (pidInfo.contains(Pname)) {
            //System.out.println("It Exist");
            return true;
        } else {
            //System.out.println("It doesnt Exist");
            return false;
        }


    }

}

