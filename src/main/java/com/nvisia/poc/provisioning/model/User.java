package com.elsevier.eols.provisioning.model;

import org.codehaus.jackson.annotate.JsonProperty;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * A provisioned User
 **/
@ApiModel(value = "User", description = "A model containing attributes for a user.")
public class User {

	@JsonProperty("firstName")
	@ApiModelProperty(value = "User First Name.")
	private String firstName;

	@JsonProperty("lastName")
	@ApiModelProperty(value = "User Last Name")
	private String lastName;

	@JsonProperty("email")
	@ApiModelProperty(value = "User email.")
	private String email;

	@JsonProperty("lmsUserId")
	@ApiModelProperty(value = "LMS User Id.")
	private String lmsUserId;

	@JsonProperty("role")
	@ApiModelProperty(value = "User role (Instructor or Student).")
	private String role;

	@JsonProperty("courseId")
	@ApiModelProperty(value = "Course Id.")
	private String courseId;

	@JsonProperty("evolveUserId")
	@ApiModelProperty(value = "Evolve User Id.")
	private String evolveUserId;

	@JsonProperty("isbn")
	@ApiModelProperty(value = "ISBN for course.")
	private String isbn;

	@JsonProperty("price")
	@ApiModelProperty(value = "Price charged.")
	private Double price;

	@JsonProperty("institutionId")
	@ApiModelProperty(value = "Calling Institution Id.")
	private String institutionId;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLmsUserId() {
		return lmsUserId;
	}

	public void setLmsUserId(String lmsUserId) {
		this.lmsUserId = lmsUserId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getEvolveUserId() {
		return evolveUserId;
	}

	public void setEvolveUserId(String evolveUserId) {
		this.evolveUserId = evolveUserId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

}
