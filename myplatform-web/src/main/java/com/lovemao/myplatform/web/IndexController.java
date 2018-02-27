package com.lovemao.myplatform.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月27日上午9:45:07 <br>
 *
 */
@Controller
public class IndexController {

	private static Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}
