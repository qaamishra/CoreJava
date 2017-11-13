package basics.systemproperties;

class SystemProperties {
    public static void main(String args[]) {
        System.out.println();

        System.out.println("User Directory : " + System.getProperty("user.dir"));

        System.out.println("User Home : " + System.getProperty("user.home"));

        System.out.println("User Name : " + System.getProperty("user.name"));

        System.out.println("Operating System Name : " + System.getProperty("os.name"));

        System.out.println("Operating System Version : " + System.getProperty("os.version"));

        System.out.println("File Separator : " + System.getProperty("file.separator"));

        System.out.println("Line Separator : " + System.getProperty("line.separator"));

        System.out.println("Path Separator : " + System.getProperty("path.separator"));

        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

        System.out.println("Java Class Version : " + System.getProperty("java.class.version"));

        System.out.println("Java Home : " + System.getProperty("java.home"));

        System.out.println("Java Version : " + System.getProperty("java.version"));

        System.out.println("Java Vendor : " + System.getProperty("java.vendor"));

        System.out.println("JVM Name : " + System.getProperty("java.vm.name"));

        System.out.println("JVM Vendor : " + System.getProperty("java.vm.vendor"));

        System.out.println("JVM Version : " + System.getProperty("java.vm.version"));

    }
}