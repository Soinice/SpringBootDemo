package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author lvyimeng
 * @version V1.0
 * @Title: springBootDemo
 * @Description: 切面例子
 * @date: 2018/10/24 18:28
 */
@Aspect
@Component
public class AspectDemo {

    /**
     * 定义一个切点
     * 表达式
     */
    @Pointcut("execution(* com.example.demo.controller..*(..))")
    public void aspectOne() {

    }

    /**
     * 目标方法执行前调用
     */
    @Before("aspectOne()")
    public void beforeMethod() {
        System.out.println("目标方法执行之前调用。。。");
    }

    /**
     * 目标方法返回后调用
     */
    @After("aspectOne()")
    public void afterMethod() {
        System.out.println("目标方法返回或者抛出异常之后调用。。。");
    }

    /**
     * 目标方法返回后调用，异常时不调用
     */
    @AfterReturning("aspectOne()")
    public void afterReturningMethod() {
        System.out.println("目标方法返回之后调用,抛出异常时不调用。。。");
    }

    /**
     * 目标方法抛出异常之后调用,正常返回时不调用
     */
    @AfterThrowing("aspectOne()")
    public void afterThrowingMethod() {
        System.out.println("目标方法抛出异常之后调用,正常返回时不调用。。。");
    }

    /**
     * 环绕通知
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("aspectOne()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕在目标方法之前。。。");
        // 访问目标方法名称
        String methodName = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        // 访问目标方法的参数
        Object[] paramsArr = joinPoint.getArgs();
        // 执行目标方法
        Object returnObj = joinPoint.proceed(paramsArr);
        System.out.println("执行的方法:" + methodName);
        System.out.println("环绕在目标方法之后。。。");
        return returnObj;
    }
}
