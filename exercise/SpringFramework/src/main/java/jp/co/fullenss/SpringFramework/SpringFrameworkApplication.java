package jp.co.fullenss.SpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jp.co.fullenss.SpringFramework.driver.Driver;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(SpringFrameworkApplication.class, args);

		context.getBean(SpringFrameworkApplication.class).execute();
	}

	@Autowired
	Driver exercise04;
	@Autowired
	Driver exercise05;
	
	public void execute(){
		exercise04.execute();
		exercise05.execute();
	}

}
