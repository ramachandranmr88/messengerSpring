package org.testSpringRest.greet.messengerSpring.controller;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.testSpringRest.greet.messengerSpring.model.Greeting;

/**
 * 
 * @author ajayram12
 *
 */
@Controller
public class MyController 
{
	private static final Logger logger = Logger.getLogger(MyController.class);

	    @RequestMapping("/hello")
	    public @ResponseBody Greeting getMessage(){
	    	logger.info(" ----> Calling getMessage() method of MyController < ----");
	        Greeting greeting = new Greeting();
	        greeting.setGreetText("Hello World from Spring Controller!!!!!");
	        return greeting;
	    }
}