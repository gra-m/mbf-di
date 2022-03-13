package fun.madeby.sfgdi;

import fun.madeby.sfgdi.controllers.ConstructorInjectedController;
import fun.madeby.sfgdi.controllers.MyController;
import fun.madeby.sfgdi.controllers.PropertyInjectedController;
import fun.madeby.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// Get handle on the Spring Context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// Grab hold of bean already in context via @Controller
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		// To see common errors remove Spring annotations starting from #3.

		System.out.println("Property Injected_English");
		// Beans are named in lower case start
		// error 1 'NoSuchBeanDefinitionException" remove @Controller from PropertyInjectedController
		PropertyInjectedController henry = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		// error 2 'NullPointerException' remove @autowired from greeting in controller (not necessary if you use Constructor dependency Injection).
		String greeting1 = henry.getGreeting();

		// error 3 'UnsatisfiedDependencyInjection' remove @Service from greeting service. Is really helpful and states:
		// required a bean of type 'fun.madeby.sfgdi.services.GreetingService' that could not be found.
		System.out.println(greeting1);

		System.out.println("SetterInjected_German");
		SetterInjectedController hermione = (SetterInjectedController)  ctx.getBean("setterInjectedController");
		String greeting2 = hermione.getGreeting();
		System.out.println(greeting2);


		System.out.println("ConstructorInjected_French");
		ConstructorInjectedController stefan = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
		String greeting3 = stefan.getGreeting();
		System.out.println(greeting3);
	}

}
