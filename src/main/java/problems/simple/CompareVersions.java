package problems.simple;

public class CompareVersions {


    public static void main(String[] args) {

        //Enter your values here
        String ver1 = "11.6.0";
        String ver2 = "11.5.1";

        CompareVersions compareVersions = new CompareVersions();

        compareVersions.compareAllVersion(ver1, ver2);

    }

    private void compareAllVersion(String ver1, String ver2) {
        String value1 = ver1;
        String value2 = ver2;
        String flag = "false";
        String[] ver1split = null, ver2split = null;
        //string array has to store all the split value...currently it doesnt.

        ver1split = value1.split("\\.");

        ver2split = value2.split("\\.");


        int ver1splitSize = ver1split.length;


        for (int i = 0; i < ver1splitSize; i++) {

            int ver1Int = Integer.parseInt(ver1split[i]);
            int ver2Int = Integer.parseInt(ver2split[i]);

            if (ver1Int <= ver2Int) {
                flag = "true";


            } else {
                flag = "false";
                break;

            }

        }

        if (flag == "true") {

            System.out.println("ver1Int <= ver2Int");
            System.out.println(ver1 + "<=" + ver2);
        } else
            System.out.println("sorry we do not support thiskeyword version");
        System.out.println(ver1 + ">" + ver2);

    }


}
