package com.soft1851.springbootaop.annotation;

import java.lang.annotation.*;

/**
 * @author xxq
 * @ClassName AuthToken
 * @Description TODO
 * @Date 2020/4/13
 * @Version 1.0
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthToken {



    /**
     *
     * @return
     */
    String[] role_name() default "";
}
