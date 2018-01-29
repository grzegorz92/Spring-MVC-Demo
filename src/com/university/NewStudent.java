package com.university;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



//import javax.validation.constraints.NotNull;

//import javax.validation.constraints.Size;



public class NewStudent {
	
	
	//Countries List
	Map<String, String> countryList = new LinkedHashMap<>();
	
	public NewStudent() {
		
	countryList.put("PL", "Poland");
	countryList.put("US", "United States");
	countryList.put("UK", "United Kingdom");
	countryList.put("DE", "Germany");
	countryList.put("ES", "Spain");
	countryList.put("IT", "Italy");
	countryList.put("HU", "Hungary");
	countryList.put("CZ", "Czechia");
	countryList.put("RU", "Russia");
	countryList.put("CA", "Canada");
	countryList.put("IR", "Irland");
	countryList.put("FR", "France");
	countryList.put("", "Other");
	
	}
	
	public Map<String,String> getCountryList() {
		
		return countryList;
	}
	
	/////
	
	@NotNull(message="Required!")
	@Size(min=3, message="At least 3 characters")
	@Pattern(regexp="[A-Za-z]+", message="Invalid name")
	private String firstName;
	
	
	@NotNull(message="Required!")
	@Size(min=3, message="At least 3 characters")
	@Pattern(regexp="[A-Za-z]+", message="Invalid last name")
	private String lastName;
	
	@NotNull(message="Required!")
	//@Pattern(regexp = "([0-9]{2}\\.){2}[0-9]{4}", message="Required!")
	private String date;
	
	@NotNull(message="Required!")
	@Pattern(regexp="[^0-9]+,[^0-9]+", message="Invalid format: \"City, Country\"")
	private String placeOfBirth;
	
	
	private String sex;
	
	@NotNull(message="Required!")
	@Pattern(regexp="[A-Za-z\\s]+", message="Invalid street name")
	private String street;
	
	@Pattern(regexp="[0-9]+", message="Invalid number")
	@NotNull(message="Required!")	
	private String houseNumber;
	
	@NotNull(message="Required!")
	@Pattern(regexp="[^A-Za-z]+", message="Invalid Postal Code")
	private String postalCode;
	
	@NotNull(message="Required!")
	@Pattern(regexp="[A-Za-z\\s]+", message="Invalid city name")
	private String city;
	

	private String country;
	
	private String fieldOfStudy;
	
	private String[] languages;
	
	
	
	////////////////////////////////////

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	///////////////////////////////
	

	
	
	

}
