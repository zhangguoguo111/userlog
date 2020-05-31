package com.zhangguoguo.log.userLog;


import java.lang.annotation.*;
/**

 * @ClassName SystemLog

 * @author lixingao 2020-05-27 15:20

 */
@Target({ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UserLog {

    /**
     * 自定义注解
     * 对于什么模块进行了什么操作（增删改查）
     */
    String userModule() default "";
    String userModuleType() default "";


}