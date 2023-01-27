package COM.SPRING.SpringRevision;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("COM/SPRING/SpringRevision/comfig.xml");
       Student student = context.getBean("student",Student.class);
        System.out.println(student);
    }
}
