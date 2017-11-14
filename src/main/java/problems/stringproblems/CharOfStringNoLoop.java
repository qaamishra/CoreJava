package problems.stringproblems;


// write code to print each char of a string without using for loop.
public class CharOfStringNoLoop {

    public static void main(String[] args) {

        CharOfStringNoLoop t = new CharOfStringNoLoop();
        String contents = "HelloTest";


        int i = 0;
        t.printall(0, contents);

        //n(n-1)/2

        //contents.charAt[i];


    }

    public void printall(int i, String contents) {

        String cont = contents;
        int length = cont.length();

        if (i == length) {

            System.exit(0);
        } else {
            System.out.println(cont.charAt(i)); //remove new line ln
            i++;

            printall(i, cont);
        }


    }


}

