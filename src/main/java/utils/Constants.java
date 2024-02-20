package utils;

import java.util.Random;

public class Constants {
    public static final String URL ="https://magento.softwaretestingboard.com/";
    public static final String FIRS_NAME = "Florents";
    public static final String LAST_NAME ="Martin";
    public static final String MAIL= generateEmail();
    public static final String LOGIN_EMAIL ="Floren9404111@gmail.com";
    public static final String PASS = "flor123CXZ$1";
    public static final String CONFIRMPASS ="flor123CXZ$1";
    public static final String ZIPE_CODE ="43215-7789";
    public static final String FONE_NUMBER ="00843217897";
    public static final String LOGIN_EMAIL2 ="Floren5730280@gmail.com";
    public static final String LOGIN_EMAIL3 ="Floren3132706@gmail.com";


    public static String generateEmail(){
        Random random = new Random();
        int number = random.nextInt(10000000);
        return "Floren"+ number +"@gmail.com";
    }

}
