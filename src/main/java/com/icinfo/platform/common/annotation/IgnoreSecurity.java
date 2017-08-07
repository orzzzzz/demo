package com.icinfo.platform.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义忽略安全检查注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface IgnoreSecurity {
    //忽略原因
    String reason() default "";
}


