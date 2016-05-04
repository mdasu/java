package asu.edu.spring.test.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");   
        //Person person = new Person();
    	Person person = (Person) context.getBean("person");
        person.speak();
    }
}
