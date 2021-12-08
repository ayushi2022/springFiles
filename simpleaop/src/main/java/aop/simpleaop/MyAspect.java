package aop.simpleaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
@Before("execution(* aop.simpleaop.paymentimplementation.makepayment())")
   public void checkAuthentication() {
	   System.out.println("authentication done");
   }
}
