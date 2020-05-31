package com.zhangguoguo.log.userLog;


import com.zhangguoguo.log.service.UserLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**

 * @ClassName UserLogAspect
 * 定义切面类
 * @author lixingao 2020-05-27 15:28

 */
@Aspect
@Component
public class UserLogAspect {
    //注入Service用于把日志保存数据库
    @Autowired
    private UserLogService userLogService;

    //Controller层切点
    @Pointcut("@annotation(com.jx.mns.log.UserLog)")
    public  void controllerAspect() {
    }

    @After("controllerAspect()")
    public  void after(JoinPoint joinPoint) throws Exception {
        //获取session中的用户
//        UserVo userVo = WebUserUtil.getUser();
        //获取请求的IP
//        String ip = WebUserUtil.getSessionId();
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String ip = request.getRemoteAddr();
//        String targetName = joinPoint.getTarget().getClass().getName();
//
//        String methodName = joinPoint.getSignature().getName();
//        Object[] arguments = joinPoint.getArgs();
        //Class targetClass = Class.forName(targetName);
//        Method[] methods = targetClass.getMethods();
//        String userModule = "";
//        String userModuleType = "";
//
//        for (Method method : methods) {
//             if (method.getName().equals(methodName)) {
//                Class[] clazzs = method.getParameterTypes();
//                if (clazzs.length == arguments.length) {
//                    userModule = method.getAnnotation(UserLog.class).userModule();
//                    userModuleType = method.getAnnotation(UserLog.class).userModuleType();
//                    break;
//                }
//             }
//        }
//        System.out.println("=====controller后置通知开始=====");
//        System.out.println("模块描述:" + userModule);
//        System.out.println("请求人:" + userVo.getUsername());
//        System.out.println("请求IP:" + ip);

        //数据库日志
//        UserLogDo userLogDo = new UserLogDo();
//        userLogDo.setUsername(userVo.getUsername());
//        userLogDo.setIp(ip);
////        SimpleDateFormat sif=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        userLogDto.setUpdateTime(sif.format(new Date()));
//        userLogDo.setUserModule(userModule);
//        userLogDo.setUserModuleType(userModuleType);
//        userLogDo.setUserModuleParam(getServiceMethodParams(joinPoint));


//        //保存数据库
//        userLogService.insert(userLogDo);
//    }
//    /**
//     *  获取json格式的参数用于存储到数据库中
//     *  @param joinPoint
//     *  @return
//     *  @throws Exception
//     */
//    private String getServiceMethodParams(JoinPoint joinPoint) throws Exception {
//        Object[] arguments = joinPoint.getArgs();
//        ObjectMapper om=new ObjectMapper();
//        return om.writeValueAsString(arguments);
    }

}
