package jp.co.fullness.demo_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jp.co.fullness.demo_app.sample.Sample;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =
		SpringApplication.run(DemoAppApplication.class, args);
		DemoAppApplication app = ctx.getBean(DemoAppApplication.class);
		app.printSample();
	}

	@Autowired
	Sample sample;
	
	public void printSample(){
		sample.print();
	}
}
