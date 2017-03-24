package net.tobebetter.validate;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * reids连接池
 * Created by 0513 on 2017/2/6.
 */
public class Messages {
    public static final String required;

    static {
        ResourceBundle bundle;
        try {
            bundle = ResourceBundle.getBundle("message-tobebetter");
        } catch (MissingResourceException e) {
            bundle = ResourceBundle.getBundle("message");
        }
        required = bundle.getString("required");
    }
}
