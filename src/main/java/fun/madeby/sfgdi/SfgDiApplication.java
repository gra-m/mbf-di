package fun.madeby.sfgdi;

import fun.madeby.sfgdi.controllers.MyController;
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
	}

}
