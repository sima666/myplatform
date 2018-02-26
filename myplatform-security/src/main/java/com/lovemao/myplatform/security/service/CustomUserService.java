package com.lovemao.myplatform.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.lovemao.myplatform.security.domain.SysUser;
import com.lovemao.myplatform.security.mapper.SysUserMapper;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:56:04 <br>
 *
 */
public class CustomUserService implements UserDetailsService {
	@Autowired
	private SysUserMapper sysUserMapper;

	@Override
	public UserDetails loadUserByUsername(String username) { // 2

		SysUser user = sysUserMapper.selectByUserName(username);
		if (user == null) {
			throw new UsernameNotFoundException("用户名不存在");
		}

		return user; // 3
	}
}
