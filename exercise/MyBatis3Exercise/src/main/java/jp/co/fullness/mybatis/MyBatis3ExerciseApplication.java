package jp.co.fullness.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jp.co.fullness.mybatis.driver.Driver;

@SpringBootApplication
public class MyBatis3ExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(MyBatis3ExerciseApplication.class, args);
		context.getBean(MyBatis3ExerciseApplication.class).execute();
	}

	@Autowired
	Driver itemTest1;
	@Autowired
	Driver itemTest2;
	public void execute(){
		itemTest1.execute();
		itemTest2.execute();
	}

}
