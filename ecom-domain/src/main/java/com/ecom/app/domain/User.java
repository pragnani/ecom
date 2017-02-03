package com.ecom.app.domain;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ecom_user", uniqueConstraints = { @UniqueConstraint(columnNames = "username") })
@Access(AccessType.FIELD)
public class User extends AbstractEntity implements IUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "username")
	private String username;

	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private boolean enabled;

	@OneToMany(cascade = CascadeType.ALL, targetEntity=Address.class)
	@JoinColumn(name = "user_id")
	private List<IAddress> adresses;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="users", targetEntity=Role.class)
	private List<IRole> roles;

	public boolean isEnabled() {
		return enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public List<IRole> getRoles() {
		return roles;
	}

	public void setRoles(List<IRole> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;

	}

	public List<IAddress> getUserAdress() {

		return adresses;
	}

	public void setUserAdress(List<IAddress> userAdress) {
		this.adresses = userAdress;

	}

}
