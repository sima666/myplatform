package com.lovemao.myplatform.web.protal;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日下午2:25:13 <br>
 *
 */
@Controller
public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		logger.info("===========login start===========");

		logger.info("===========login Enndd===========");
		return "protal/login";
	}
}
