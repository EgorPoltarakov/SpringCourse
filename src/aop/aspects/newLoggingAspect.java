package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class newLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookloggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("aroundReturnBookloggingAdvice: В библиотеку пытаются вернуть книгу");

        Object targetMethodResult = null;
        try {
             targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookloggingAdvice: было залогировано исключение " + e); 
            throw e;
        }
        System.out.println("aroundReturnBookloggingAdvice: В библиотеку успешно вернули книгу");


        return targetMethodResult;
    }
}
