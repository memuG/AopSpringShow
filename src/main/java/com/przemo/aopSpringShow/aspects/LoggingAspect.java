package com.przemo.aopSpringShow.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("within (com.przemo..*)")
    public void logExecution() {
        Logger.getLogger(this.getClass().getName()).info("Executing method in com.przemo ...");
    }

}