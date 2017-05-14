package org.testSpringRest.greet.messengerSpring.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.testSpringRest.greet.messengerSpring.model.Greeting;

/**
 * 
 * @author ajayram12
 *
 */
@RestController
@RequestMapping("myresource")
public class MyRESTController {
	private static final Logger logger = Logger.getLogger(MyRESTController.class);

	@RequestMapping(value = "/helloRest", method = RequestMethod.GET, produces = "application/json")
	public Greeting getMessage() {
		logger.info(" ----> Calling getMessage() method of MyRESTController < ----");
		Greeting greeting = new Greeting();
		greeting.setGreetText("Hello World from Spring Rest Controller!!!!!");
		return greeting;
	}
}