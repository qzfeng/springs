package com.studying.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengqz on 2017-4-10.
 */
public class Aspect {
    private Map<Object, Integer> countOKMap = new HashMap<Object, Integer>();
    private Map<Object, Integer> countNGMap = new HashMap<Object, Integer>();
    private Map<Object, Integer> countTrackMap = new HashMap<Object, Integer>();

    public void doBefore(ProceedingJoinPoint pj) {
        String name = pj.getSignature().getDeclaringType().getName();
        System.out.println(name);
        for (int i = 0; i < pj.getArgs().length; i++) {
            System.out.println("Arg[" + i + "]:" + pj.getArgs()[i]);
        }
        System.out.println("AOP before method");
    }

    public void doAfter(ProceedingJoinPoint pj) {
        System.out.println("AOP after method");
    }

    public void doAfterReturn(ProceedingJoinPoint pj) {
        String name = pj.getSignature().getDeclaringType().getName();
        countOKMap.put(name, getCountOK(name) + 1);
        System.out.println(name + ":" + countOKMap.get(name));
        countTrackMap.put(pj.getArgs()[0], getCountTrack((Integer) pj.getArgs()[0]) + 1);
        System.out.println("Track" + pj.getArgs()[0] + ":" + countTrackMap.get(pj.getArgs()[0]));
        System.out.println("AOP after method return");
    }

    public void doAfterThrow(ProceedingJoinPoint pj) {
        String name = pj.getSignature().getDeclaringType().getName();
        countNGMap.put(name, getCountNG(name) + 1);
        System.out.println(name + ":" + countNGMap.get(name));
        System.out.println("AOP after method throw");
    }

    public void doAround(ProceedingJoinPoint pj) {
        try {
            doBefore(pj);
            pj.proceed();
            doAfterReturn(pj);
        } catch (Throwable throwable) {
            doAfterThrow(pj);
        }
    }

    private Integer getCountOK(String s) {
        return getCount(countOKMap, s);
    }

    private Integer getCountNG(String s) {
        return getCount(countNGMap, s);
    }

    private Integer getCountTrack(int trackNo) {
        return getCount(countTrackMap, trackNo);
    }
    private Integer getCount(Map<Object,Integer> map, Object o) {
        return map.containsKey(o) ? map.get(o) : 0;
    }
}
