package utilities;


import java.io.FileInputStream;
import java.io.PushbackInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String driverPath;
    private static String url;
    private static String login_username;
    private static String login_password;
    private static String bad_username;
    private static String bad_login_password;
    private static String first_name;
    private static String last_name;
    private static String postalcode;



    public static PropertyManager getInstance() {

        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new
                    FileInputStream("src/main/resources/configuration.properties");
            prop.load(fi);

        } catch (Exception e) {
            e.printStackTrace();
        }

        driverPath = prop.getProperty("driverPath");
        url = prop.getProperty("url");
        login_username = prop.getProperty("username");
        login_password = prop.getProperty("password");
        bad_username = prop.getProperty("bad_username");
        bad_login_password = prop.getProperty("bad_login_password");
        first_name = prop.getProperty("first_name");
        last_name = prop.getProperty("last_name");
        postalcode = prop.getProperty("postalcode");

        return instance;

    }
    public String getDriverPath(){
        return driverPath;

    }
    public String getURL(){
        return url;
    }
    public String getLogin_username(){
        return login_username;
    }
    public String getLogin_password(){
        return login_password;
    }
    public String getBadUsername(){
        return bad_username;
    }
    public String getBadLoginPassword(){
        return bad_login_password;
    }
    public String getFirst_name(){return first_name;}
    public String getLast_name(){return last_name;}
    public String getPostalcode(){return postalcode;}

}
