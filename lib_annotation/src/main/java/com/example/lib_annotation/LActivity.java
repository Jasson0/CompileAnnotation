package com.example.lib_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by shuihu on 2018/5/31.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface LActivity {
}
