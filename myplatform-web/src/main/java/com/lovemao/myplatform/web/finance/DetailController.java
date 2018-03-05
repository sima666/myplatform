package com.lovemao.myplatform.web.finance;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @Description 理财明细<br>
 * @Author MaoC <br>
 * @Since 2018年2月28日下午4:19:14 <br>
 *
 */
@Controller
public class DetailController {

	private static Logger logger = Logger.getLogger(DetailController.class);

	@RequestMapping(value = "/finance/detail", method = RequestMethod.GET)
	public String detail() {

		return "/finance/detail";
	}

}
