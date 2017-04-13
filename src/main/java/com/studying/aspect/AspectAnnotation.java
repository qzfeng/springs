package com.studying.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by fengqz on 2017-4-12.
 */
@Aspect
public class AspectAnnotation {

    @Pointcut("execution(* com.studying.demo.*Service.*(..))")
    public void ddd() {

    }

    @Before("ddd()")
    public void doBefore() {
        System.out.println("AspectAnnotation before method");
    }

    @After("ddd()")
    public void doAfter() {
        System.out.println("AspectAnnotation after method");
    }

    @AfterReturning("ddd()")
    public void doAfterReturn() {
        System.out.println("AspectAnnotation after method return");
    }

    @AfterThrowing("ddd()")
    public void doAfterThrow() {
        System.out.println("AspectAnnotation after method throw");
    }

//    @Around("ddd()")
    public Object doAround(ProceedingJoinPoint pj) {
        Object o = null;
        try {
            doBefore();
            o = pj.proceed();
            doAfterReturn();
        } catch (Throwable throwable) {
            doAfterThrow();
        }
            return o;
    }

}
