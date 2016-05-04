package asu.edu.spring.test.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/asu/edu/spring/test/springTest/beans/beans.xml");
    	ApplicationContext context = new ClassPathXmlApplicationContext("asu/edu/spring/test/springTest/beans/beans.xml");

        System.out.println( "Hello World!" );
        Person person = (Person) context.getBean("person");
        person.speak();
        
        Address address = (Address) context.getBean("address");
        
        System.out.println(person);
        System.out.println(address);
        
        //((FileSystemXmlApplicationContext) context).close();
        ((ClassPathXmlApplicationContext) context).close();

    }
}

