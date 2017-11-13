package problems.simple;


// write code to print each char of a string without using for loop.
public class ReverseAStringRecursively {

    public static void main(String[] args) {

        ReverseAStringRecursively t = new ReverseAStringRecursively();
        String contents = "HelloTest";


        int i = contents.length() - 1;
        t.printall(i, contents);

        //n(n-1)/2

        //contents.charAt[i];


    }

    public void printall(int i, String contents) {

        String cont = contents;
        //int length=cont.length();

        if (i < 0) {

            System.exit(0);
        } else {
            System.out.print(cont.charAt(i)); //remove new line ln
            i--;

            printall(i, cont);
        }


    }


}

