package com.lovemao.myplatform.security.mapper;

import com.lovemao.myplatform.security.domain.SysUser;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:54:42 <br>
 *
 */
public interface SysUserMapper {

	SysUser selectByUserName(String username);

}
