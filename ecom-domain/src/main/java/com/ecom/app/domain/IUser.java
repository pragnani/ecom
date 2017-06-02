package com.ecom.app.domain;

import java.util.List;

public interface IUser {

	/**
	 * @param enabled
	 */
	void setEnabled(boolean enabled);

	/**
	 * @return
	 */
	boolean isEnabled();

	/**
	 * @return
	 */
	String getName();

	/**
	 * @param name
	 */
	void setName(String name);

	/**
	 * @return
	 */
	String getEmail();

	/**
	 * @param email
	 */
	void setEmail(String email);

	/**
	 * @return
	 */
	String getPassword();

	/**
	 * @param password
	 */
	void setPassword(String password);


	/**
	 * @return
	 */
	List<IAddress> getUserAdress();

	/**
	 * @param userAdress
	 */
	void setUserAdress(List<IAddress> userAdress);

	/**
	 * @param userid
	 */
	void setUserId(Long userid);

	/**
	 * @return
	 */
	Long getUserId();

	/**
	 * @return
	 */
	List<IRole> getRoles();

	/**
	 * @param roles
	 */
	void setRoles(List<IRole> roles);

	 /**
	 * @return
	 */
	String getUsername();

	 /**
	 * @param username
	 */
	void setUsername(String username);

}
