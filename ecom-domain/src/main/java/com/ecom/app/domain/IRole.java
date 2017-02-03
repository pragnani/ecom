package com.ecom.app.domain;

import java.util.List;

public interface IRole {
	String getName();

	void setName(String name);

	Long getRoleId();

	void setRoleId(Long roleId);

	List<IUser> getUsers();

	void setUsers(List<IUser> users);

	public String getDisplayName();

	public void setDisplayName(String displayName);

}
