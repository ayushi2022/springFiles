package annotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationdemo\\config.xml");
        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee);
        Employee employee1 = context.getBean("employee",Employee.class);
        System.out.println(employee1);
        Employee employee2 = context.getBean("employee",Employee.class);
        System.out.println(employee2);
    }
}
