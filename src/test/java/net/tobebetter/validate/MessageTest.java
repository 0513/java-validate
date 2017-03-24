package net.tobebetter.validate;

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试获取资源文件
 */
public class MessageTest {
    @Test
    public void getMessage(){
        Assert.assertEquals("{label}不能为空", Messages.required);
    }
}
