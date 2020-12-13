package com.playsafe.conversion.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DurationAspect {
    private final Logger log = LoggerFactory.getLogger(DurationAspect.class);

    @Pointcut("execution(* com.playsafe.conversion.service.api.ConversionService.*(..))")
    private void logTime(){

    }

    @Around("logTime()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        final long start = System.currentTimeMillis();

        final Object proceedExecution = joinPoint.proceed();

        final long executionTime = System.currentTimeMillis() - start;

        log.info("{} execution time in <------------------------> {} miliseconds", joinPoint.getSignature(), executionTime);

        return proceedExecution;
    }
}
