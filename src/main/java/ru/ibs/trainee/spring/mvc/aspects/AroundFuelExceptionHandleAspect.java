package ru.ibs.trainee.spring.mvc.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AroundFuelExceptionHandleAspect {

    @Around("@annotation(ru.ibs.trainee.spring.mvc.validation.FuelExceptionHandle)")
    public Object aroundShowInfoAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object s = null;
        try {
           s =  proceedingJoinPoint.proceed();
        } catch (RuntimeException e) {
            System.out.println(e);
         return "Что то пошло не так";
        }
        return s;
    }

}
