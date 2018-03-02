package com.university.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="new_students")
public class NewStudent {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	
	@Column(name="first_name")
	@NotNull(message="Required!")
	@Size(min=3, message="At least 3 characters")
	@Pattern(regexp="[A-Za-z]+", message="Invalid name")
	private String firstName;
	
	@Column(name="last_name")
	@NotNull(message="Required!")
	@Size(min=3, message="At least 3 characters")
	@Pattern(regexp="[A-Za-z]+", message="Invalid last name")
	private String lastName;
	
	
	@Column(name="birth_date")
	@NotNull(message="Required!")
	private String birthDate;
	
	@Column(name="birth_place")
	@NotNull(message="Required!")
	@Pattern(regexp="[^0-9]+,[^0-9]+", message="Invalid format: \"City, Country\"")
	private String birthPlace;
	
	@Column(name="sex")
	private String sex;
	
	@Column(name="street_name")
	@NotNull(message="Required!")
	@Pattern(regexp="[A-Za-z\\s]+", message="Invalid street name")
	private String streetName;
	
	@Column(name="house_number")
	@Pattern(regexp="[0-9]+", message="Invalid number")
	@NotNull(message="Required!")	
	private String houseNumber;
	
	@Column(name="postal_code")
	@NotNull(message="Required!")
	@Pattern(regexp="[^A-Za-z]+", message="Invalid Postal Code")
	private String postalCode;
	
	@Column(name="city")
	@NotNull(message="Required!")
	@Pattern(regexp="[A-Za-z\\s]+", message="Invalid city name")
	private String city;
	
	@NotNull(message="Select the country!")
	@Column(name="country")
	private String country;
	
	@Column(name="field_of_study")
	private String fieldOfStudy;
	
	//@Column(name="prefered_languages")
	//private String[] preferedLanguages;

	
	//no-arg Constructor?
	public NewStudent() {};
	
	
	///////////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}


	@Override
	public String toString() {
		return "NewStudent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", birthPlace=" + birthPlace + ", sex=" + sex + ", streetName=" + streetName
				+ ", houseNumber=" + houseNumber + ", postalCode=" + postalCode + ", city=" + city + ", country="
				+ country + ", fieldOfStudy=" + fieldOfStudy + "]";
	}

	
	
	
	
	
}
	
	
	
	
	
	

