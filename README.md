## java字段验证

提供常见数据验证的简单便捷的验证

## 验证方式

* ["abc", "name", "String", "maxLength:20", "required"]
* Validate.setValue("abc").setLabel("name").setType("String").setMaxLength(20)...

## 返回

```javascript
{
    "validate":false,
    "fields":[
        {
            "label":"name",
            "validate":false,
            "messages":[
                "姓名最大长度不能大于3",
                "姓名格式不正确"
            ]
        }
    ]
}
```

## 注意

* 如果国际化文件：validate.properties已被占用，请使得：validate.tobebetter.properties

## 要求

* 做成可以用字符串简单定义规则的形式
* 用builder模式做成易编码的格式
* 做成可扩展自定义规则