package com.lovemao.myplatform.web.finance;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @Description 收入<br>
 * @Author MaoC <br>
 * @Since 2018年2月27日上午10:35:48 <br>
 *
 */
@Controller
public class IncomeController {

	private static Logger logger = Logger.getLogger(IncomeController.class);

	@RequestMapping(value = "/finance/income", method = RequestMethod.GET)
	public String income() {
		return "/finance/income";
	}

}
