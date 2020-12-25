package basics.iostreams;

class BytesExperiment {
    public static void main(String args[]) throws Exception {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123345677890";

        byte b[] = s.getBytes();

        for (int i = 0; i < s.length(); i++) {
            System.out.println("" + b[i]);
        }

        /*char p = 'È';       // line 1
        System.out.println("P==" + p);
        System.out.println("P int value " + (int) p);

        byte q = (byte) p;// line 2
        System.out.println("\n\nQ is a byte value of p = 'È' ==" + q);

        char byteToChar = (char) q;   // line 3
        System.out.println("\n\nChar byteToChar==" + byteToChar);
        System.out.println("byteToChar int value" + (int) byteToChar);
*/
        //a byte variable can hold any value from -128 to 127 but a char variable can hold any value between 0 and 255.
        //Another difference between char and byte is that char is larger data type than a byte. The range of byte is between -128 to 127 but the range of char is from 0 to 65535 because byte is a signed 8-bit data type and char is an unsigned 16-bit data type hence, its maximum value is 2 ^ 16 - 1 which is 65535.


    }
}