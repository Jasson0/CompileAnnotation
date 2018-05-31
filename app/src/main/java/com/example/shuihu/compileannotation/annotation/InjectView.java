package com.example.shuihu.compileannotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shuihu on 2018/5/31.
 */
//默认的保留策略，注解会在class字节码文件中存在，但运行时无法获得,说明这个注解是编译时注解。并不能反射获得
@Retention(RetentionPolicy.CLASS)
//这个注解的对象是接口、类、枚举、注解
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface InjectView {
    int value();
}
