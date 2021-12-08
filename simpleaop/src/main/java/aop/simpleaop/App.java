package aop.simpleaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("simpleaop\\config.xml");
        payment payment = context.getBean("payment",paymentimplement.class);
        MyAspect aspect = context.getBean("payment",MyAspect.class);
        payment.makepayment();
    }
}
