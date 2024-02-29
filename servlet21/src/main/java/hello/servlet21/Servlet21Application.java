package hello.servlet21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan //서블릿 자동등록
@SpringBootApplication
public class Servlet21Application {

	public static void main(String[] args) {
		SpringApplication.run(Servlet21Application.class, args);
	}

}
