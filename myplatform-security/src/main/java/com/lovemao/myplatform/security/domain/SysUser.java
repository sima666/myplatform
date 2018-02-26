package com.lovemao.myplatform.security.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 
 * @Description 用户--让我们的用户实体实现UserDetails接口，我们的用户实体即为Spring Security所使用的用户<br>
 *              <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:51:38 <br>
 *
 */
public class SysUser implements UserDetails {
	private Long id;

	private String userId;

	private String username;

	private String password;

	private List<SysRole> roles;

	private static final long serialVersionUID = 1L;

	/**
	 *
	 * @Title:
	 * @Description:重写getAuthorities方法，将用户的角色作为权限
	 * @Author MaoC
	 * @Since:2017年8月21日下午10:59:18
	 * @Param:
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		List<SysRole> roles = this.getRoles();
		for (SysRole role : roles) {
			auths.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		return auths;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.username = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<SysRole> getRoles() {
		return roles;
	}

	public void setRoles(List<SysRole> roles) {
		this.roles = roles;
	}

}
