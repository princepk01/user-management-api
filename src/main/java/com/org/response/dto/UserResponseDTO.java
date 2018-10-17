package com.org.response.dto;

import java.io.Serializable;
import java.util.Date;

public class UserResponseDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7644100534131888118L;

	private Long id;
	private String userId;
	private String name;
	private Date dateOfBirth;
	private String fatherName;
	private String motherName;
	private Long mobileNumber;
	private String gender;
	private String permanentAddress;
	private String presentAddress;
	private String country;
	private String state;
	private String city;
	private Integer pinCode;
	private String email;
	private Date gmtCreated;
	private Date gmtModified;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getGmtCreated() {
		return gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "UserResponseDTO [id=" + id + ", userId=" + userId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + ", permanentAddress=" + permanentAddress + ", presentAddress=" + presentAddress
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", pinCode=" + pinCode + ", email="
				+ email + ", gmtCreated=" + gmtCreated + ", gmtModified=" + gmtModified + "]";
	}

}
