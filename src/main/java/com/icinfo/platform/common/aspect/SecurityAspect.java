package com.icinfo.platform.common.aspect;

import com.icinfo.platform.common.annotation.IgnoreSecurity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * 接口调用安全切面
 */
@Aspect
@Component
public class SecurityAspect {
    private static final Logger logger = LoggerFactory.getLogger(SecurityAspect.class);

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void methodAspect() {
    }

    @Around("methodAspect()")
    public Object execute(ProceedingJoinPoint pjp) throws Throwable {
        // 1.从切点上获取目标方法
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();

        // 2.判断是否需要做安全检查
        if (method.isAnnotationPresent(IgnoreSecurity.class)) {
            return pjp.proceed();
        }

        System.out.println("aspect coming----------------");
        logger.info("aspect coming----------------");
        return pjp.proceed();
    }
}
