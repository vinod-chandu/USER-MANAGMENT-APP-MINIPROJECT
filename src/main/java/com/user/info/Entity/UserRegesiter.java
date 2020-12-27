package com.user.info.Entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "USERREGEISTER_DATA")
@Data
public class UserRegesiter {
//VELAGAPUDI CHANDU 
	@Id
	@GeneratedValue
	@Column(name = "USERID")
	private Integer userId;

	@Column(name = "User_FristName")
	@NotEmpty(message = "Please enter user frist name:")
	private String fristName;

	@Column(name = "User_LastName")
	@NotEmpty(message = "PLEASE ENTER USER LASTNAME")
	@Size(min = 2, max = 8, message = "SIZE SHOUBLD BE min = 2,max = 8,")
	private String lastName;

	@Column(name = "User_Email")
	@Email(regexp = "^(.+)@(.+)$", message = "PLEASE ENTER VALID EMAIL ID")
	private String email;

	@Column(name = "User_PhoneNumber")
	@Min(value = 10, message = "NUMBER MINIMUM 10 DIGITS")
	@Max(value = 10, message = "NUMBER NOT GRATER THAN 10")
	private Long phoneNumber;

	@Column(name = "User_DOB")
	@DateTimeFormat(pattern = "DATE OF BIRTH SHOULD NOT BE LESS THAN 1950")
	private Date dob;

	@Column(name = "User_Gender")
	@NotNull(message = "GENEDER SHOULD NOT NULL")
	private boolean gender;

	@Column(name = "User_Countary")
	@NotEmpty(message = "PLEASE ENTER USER COUNTARY NAME:")
	private String[] countary;

	@Column(name = "User_State")
	@NotEmpty(message = "PLEASE ENTER USER STATE NAME:")
	private String[] state;

	@Column(name = "User_City")
	@NotEmpty(message = "PLEASE ENTER USER CITY NAME:")
	private String[] city;

	@NotNull
	@Column(name = "USER_EMAIL_ID")
	private String emailId;
	@NotNull
	@Column(name = "user_Password")
	private String userPassword;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String[] getCountary() {
		return countary;
	}

	public void setCountary(String[] countary) {
		this.countary = countary;
	}

	public String[] getState() {
		return state;
	}

	public void setState(String[] state) {
		this.state = state;
	}

	public String[] getCity() {
		return city;
	}

	public void setCity(String[] city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserRegesiter [userId=" + userId + ", fristName=" + fristName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", gender=" + gender + ", countary="
				+ Arrays.toString(countary) + ", state=" + Arrays.toString(state) + ", city=" + Arrays.toString(city)
				+ ", getUserId()=" + getUserId() + ", getFristName()=" + getFristName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getDob()=" + getDob() + ", isGender()=" + isGender() + ", getCountary()="
				+ Arrays.toString(getCountary()) + ", getState()=" + Arrays.toString(getState()) + ", getCity()="
				+ Arrays.toString(getCity()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
