package basics.propertiesreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Ashutosh on 30-Aug-16.
 * Please contact mishra.techie@gmail.com with your queries
 */
public class PropertiesInitializer {


    private static PropertiesInitializer instance =null;


    private Properties props = null;

    //Private constructor so that no other class can try to create the object
    private PropertiesInitializer() throws FileNotFoundException, IOException{


        this.props=new Properties();
        File fileUserProp = new File("dbConfig.properties");
//           d_String pathUserProp = fileUserProp.getAbsolutePath();
        //System.out.println(pathUserProp);
        props.load(new FileInputStream(fileUserProp));
    }

    public static PropertiesInitializer getInstance() throws FileNotFoundException, IOException{
        if(instance==null){
            instance=new PropertiesInitializer();
        }

        return instance;
    }

    //Generic
    public String getValue(String propKey){
        return props.getProperty(propKey);
    }

    public  String getJdbcDriver(){
        return props.getProperty("JDBC_DRIVER");
    }

    public  String getDbURL(){
        return props.getProperty("DB_URL");
    }

    public  String getDbUsername(){
        return props.getProperty("USER");
    }

    public String getDbPassword(){
        return props.getProperty("PASS");

    }

}
