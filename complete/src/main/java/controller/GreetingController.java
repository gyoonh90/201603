package controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import domain.Greeting;
/**
 * 
 * Greeting 관련 Controller
 * @author gyun
 *
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

	/**
	 * 
	 * Greeting 하는 메소드1
	 * @author gyun
	 *
	 */
    @RequestMapping("/greeting/greeting1")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
	/**
	 * 
	 * Greeting 하는 메소드2 
	 * @author gyun
	 *
	 */
    @RequestMapping("/greeting/greeting2")
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet()+1,
                            String.format(template, name));
    }
}
