package com.ecom.app.domain;

public interface IAddress {

	void setStreet(String street);

	String getStreet();

	String getCity();

	void setCity(String city);

	String getState();

	void setState(String state);

	String getZipcode();

	void setZipcode(String zipcode);

	Long getAddressId();

	void setAddressId(Long addressId);

}
