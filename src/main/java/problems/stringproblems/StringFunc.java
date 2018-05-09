package problems.stringproblems;

public class StringFunc {

    public static void main(String[] args) {
        String str="StudyTonight";
        str.concat(".com");
        str=str.toUpperCase();
        str.replace("TONIGHT","today");
        System.out.println(str);
    }
}
