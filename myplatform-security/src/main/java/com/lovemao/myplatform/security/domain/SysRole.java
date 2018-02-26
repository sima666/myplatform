package com.lovemao.myplatform.security.domain;

/**
 * 
 * @Description <br>
 * @Author MaoC <br>
 * @Since 2018年2月26日上午10:51:16 <br>
 *
 */
public class SysRole {

	private Long id;
	private String roleId;
	private String roleName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
