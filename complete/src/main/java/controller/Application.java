package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * 스프링 부트로 어플리 케이션을 실행하는 부분
 * @author gyun
 *
 */
@SpringBootApplication
public class Application {
	/**
	 * 
	 * 스프링 부트로 어플리 케이션을 실행하는 부분의 메인 메소드이다
	 * @author gyun
	 *
	 */
    public static void main(String[] args) {
    	System.out.println("===========================Welcome===========================");
        SpringApplication.run(Application.class, args);
    }
}
