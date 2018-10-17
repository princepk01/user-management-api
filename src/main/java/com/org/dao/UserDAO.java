package com.org.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAIL")
public class UserDAO {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Column(name = "FATHER_NAME")
	private String fatherName;
	@Column(name = "MOTHER_NAME")
	private String motherName;
	@Column(name = "MOBILE_NO")
	private Long mobileNumber;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "PERMANENT_ADDRESS")
	private String permanentAddress;
	@Column(name = "PRESENT_ADDRESS")
	private String presentAddress;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "STATE")
	private String state;
	@Column(name = "CITY")
	private String city;
	@Column(name = "PIN_CODE")
	private Integer pinCode;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "GMT_CREATED")
	private Date gmtCreated;
	@Column(name = "GMT_MODIFIED")
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
		return "UserDAO [id=" + id + ", user_id=" + userId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", fatherName=" + fatherName + ", motherName=" + motherName + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + ", permanentAddress=" + permanentAddress + ", presentAddress=" + presentAddress
				+ ", country=" + country + ", state=" + state + ", city=" + city + ", pinCode=" + pinCode + ", email="
				+ email + ", gmtModified=" + gmtModified + ", gmtModified=" + gmtModified + "]";
	}

}
