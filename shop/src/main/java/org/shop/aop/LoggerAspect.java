package org.shop.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggerAspect {
    final static Logger logger = Logger.getLogger(LoggerAspect.class);

    @Pointcut("execution(* *(..))  && !within(is(FinalType)) && !within(org.shop.DataInitializer)")
    public void callAllMethodsExludeFinalClasses() { }

    @Before("callAllMethodsExludeFinalClasses()")
    public void beforeCallAtMethod(JoinPoint jp) {
        logger.info("Отрабатывает метод " + jp.getSignature());
    }
}