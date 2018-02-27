package com.lovemao.myplatform.validation.configuration;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 
 * @Description api日志和校验<br>
 * @Author MaoC <br>
 * @Since 2018年2月27日上午10:58:41 <br>
 *
 */
@Component
@Aspect
public class ApiLoggerAndValidation {

	private static Logger logger = Logger.getLogger(ApiLoggerAndValidation.class);

	@Around("execution(* com.lovemao.myplatform..*(..))")
	public Object validate(ProceedingJoinPoint joinPoint) throws Throwable {
		String method = joinPoint.getSignature().toLongString();
		logger.info("=====================ApiLogger Start=======================");
		logger.info("Method>>>>>>>>>" + method);
		Object obj = joinPoint.proceed();
		logger.info("=====================ApiLogger Enndd=======================");
		return obj;
	}

}
