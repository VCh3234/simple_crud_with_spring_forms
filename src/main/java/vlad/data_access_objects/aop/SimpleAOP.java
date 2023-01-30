package vlad.data_access_objects.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SimpleAOP {

    @Pointcut("execution(* vlad.data_access_objects.dao.*.* (..))")
    private void allMethodsFromDAOPointCut(){}

    @Around("allMethodsFromDAOPointCut()")
    private Object allMethodsFromDAOAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Start: " + methodSignature.getName());
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("End: " + methodSignature.getName());
        return targetMethodResult;
    }
}
