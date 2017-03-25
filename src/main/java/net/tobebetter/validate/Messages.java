package net.tobebetter.validate;

import java.io.UnsupportedEncodingException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 错误提示信息
 */
public class Messages {
    public static ResourceBundle bundle;
    public static final String required;

    static {
        try {
            bundle = ResourceBundle.getBundle("messages.tobebetter");
        } catch (MissingResourceException e) {
            bundle = ResourceBundle.getBundle("messages");
        }
        required = getPropertiesStringEncode("required");
    }

    private static String getPropertiesStringEncode(String key) {
        try {
            return new String(bundle.getString(key).getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
