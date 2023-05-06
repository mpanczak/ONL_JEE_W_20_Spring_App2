package pl.coderslab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;

/**
 * Hello world!
 *
 */
public class SpringDiApplication
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello();
        context.close();
    }
}