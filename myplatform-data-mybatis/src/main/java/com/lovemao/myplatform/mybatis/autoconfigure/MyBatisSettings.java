package com.lovemao.myplatform.mybatis.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:22:36 <br>
 *
 */
@ConfigurationProperties(prefix = "myplatform.mybatis")
public class MyBatisSettings {
	private String dialect = "";
	private String offsetAsPageNum = "false";
	private String rowBoundsWithCount = "false";
	private String pageSizeZero = "false";
	private String reasonable = "false";
	private String params = "";

	public String getDialect() {
		return this.dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}

	public String getOffsetAsPageNum() {
		return this.offsetAsPageNum;
	}

	public void setOffsetAsPageNum(String offsetAsPageNum) {
		this.offsetAsPageNum = offsetAsPageNum;
	}

	public String getRowBoundsWithCount() {
		return this.rowBoundsWithCount;
	}

	public void setRowBoundsWithCount(String rowBoundsWithCount) {
		this.rowBoundsWithCount = rowBoundsWithCount;
	}

	public String getPageSizeZero() {
		return this.pageSizeZero;
	}

	public void setPageSizeZero(String pageSizeZero) {
		this.pageSizeZero = pageSizeZero;
	}

	public String getReasonable() {
		return this.reasonable;
	}

	public void setReasonable(String reasonable) {
		this.reasonable = reasonable;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

}
