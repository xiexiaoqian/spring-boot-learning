package com.soft1851.springbootaop.annotation;

import java.lang.annotation.*;

/**
 * 自定义的Web日志注解
 * @author 23208
 */

//元注解，定义注解被保留策略，一般有三种策略
//1、RetentionPolicy.SOURCE 注解只保留在源文件中，在编译成class文件的时候被遗弃
//2、RetentionPolicy.CLASS 注解被保留在class中，但是在jvm加载的时候北欧抛弃，这个是默认的声明周期
//3、RetentionPolicy.RUNTIME 注解在jvm加载的时候仍被保留

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)             //定义了注解声明在哪些元素之前
public @interface ControllerWebLog {

    /**
     * 调用的接口名称
     * @return
     */
    String name();

    /**
     * 标识该日志是否需要持久化储存
     * @return
     */
    boolean isSaved() default false;
}
