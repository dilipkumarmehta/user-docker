package com.dilip.shoping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
	
public class UserServiceController {

	/*
	 * @Autowired MappingService mappingService;
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public String login() {
		String loginResponsc = "Hello i'am from docker container";
		return loginResponsc;

	}
	/*
	 * @RequestMapping(value = "/logout/{userId}", method = RequestMethod.POST,
	 * produces = "application/json", consumes = "application/json") public Status
	 * logOut(@PathVariable(value = "userid") String userId) { return null;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/signup", method = RequestMethod.POST, produces =
	 * "application/json", consumes = "application/json") public Status
	 * signUp(@RequestBody User user) { Status signupResponse =
	 * userService.signUp(user); return signupResponse;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/changepassword", method = RequestMethod.POST,
	 * produces = "application/json", consumes = "application/json") public Status
	 * changePassword(@RequestBody Password password) { return
	 * userService.changepasswor(password);
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value = "/jps", method = RequestMethod.POST, produces =
	 * "application/json", consumes = "application/json") public void JPADemo() {
	 * mappingService.allMaping();
	 * 
	 * }
	 */
	// @RequestMapping(value="/pow", method=RequestMethod.GET
	// (@RequestParam(value="base") int base1)

	// @RequestMapping("/sqrt/{num}")
	// public double sqrt(@PathVariable(value="num") int num1)
}
