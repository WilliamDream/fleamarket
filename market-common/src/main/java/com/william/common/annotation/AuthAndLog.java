package com.william.common.annotation;

import java.lang.annotation.*;

/**
 * @Author: WilliamDream
 * @Description: 权限和日志注解
 * @Date: 2019/6/23 22:54
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAndLog {

}
