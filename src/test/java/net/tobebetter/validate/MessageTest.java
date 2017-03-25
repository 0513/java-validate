package net.tobebetter.validate;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * 测试获取资源文件
 */
public class MessageTest {
    @Test
    public void getMessage() throws UnsupportedEncodingException {
        System.out.println(Messages.required);
    }
}
