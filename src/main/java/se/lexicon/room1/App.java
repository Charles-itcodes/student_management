package se.lexicon.room1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.room1.configuration.ComponentScanConfig;
import se.lexicon.room1.data_access.StudentDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDAO studentDao = context.getBean(StudentDAO.class);

        System.out.println("HelloWorld");
    }



}
