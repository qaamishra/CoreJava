package basics.propertiesreader;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ashutosh on 30-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class PropertiesReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String DB_URL = PropertiesInitializer.getInstance().getValue("DB_URL");
        System.out.println(DB_URL);

        System.out.println("\n=================================");

        //OR
        String dbURL=PropertiesInitializer.getInstance().getDbURL();
        String dbPAss=PropertiesInitializer.getInstance().getDbPassword();
        String dbuser=PropertiesInitializer.getInstance().getDbUsername();
        String jdbc=PropertiesInitializer.getInstance().getJdbcDriver();

        System.out.println(dbURL);
        System.out.println(dbPAss);
        System.out.println(dbuser);
        System.out.println(jdbc);

    }
}
