package dev.draxano.JavaAOP;


import fighter.Boxer;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAopApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var fighter1 = context.getBean(Boxer.class);

		fighter1.setName("Canelo Alvarez");
		fighter1.setCountry("Mexico");

		fighter1.introduction();


	}

}
