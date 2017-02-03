package com.ecom.app.domain;

import java.util.List;

public interface IUser {

	void setEnabled(boolean enabled);

	boolean isEnabled();

	String getName();

	void setName(String name);

	String getEmail();

	void setEmail(String email);

	String getPassword();

	void setPassword(String password);


	List<IAddress> getUserAdress();

	void setUserAdress(List<IAddress> userAdress);

	void setUserId(Long userid);

	Long getUserId();

	List<IRole> getRoles();

	void setRoles(List<IRole> roles);

	 String getUsername();

	 void setUsername(String username);

}
