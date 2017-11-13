package problems.simple;

//Latest
class PrimeNumbers {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        int flag = 0;

        for (i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }


    }
}