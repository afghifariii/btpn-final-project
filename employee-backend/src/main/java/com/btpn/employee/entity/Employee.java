package com.btpn.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "t_employee")
public class Employee {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "emp_id")
	private String empId;
	
	@NotNull @NotEmpty
	@Column(name = "first_name", length = 45, nullable = false)
	private String firstName;
	
	@NotNull @NotEmpty
	@Column(name = "last_name", length = 45, nullable = false)
	private String lastName;
	
	@NotNull @NotEmpty
	@Column(length = 6, nullable = false)
	private String gender;
	
	@NotNull
	@Column(name = "date_of_birth", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@NotNull @NotEmpty
	@Column(length = 45, nullable = false)
	private String nationality;
	
	@NotNull @NotEmpty
	@Column(name = "marital_status", length = 7, nullable = false)
	private String maritalStatus;
	
	@NotNull @NotEmpty
	@Column(length = 25, nullable = false, unique = true)
	private String phone;
	
	@NotNull @NotEmpty
	@Email
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	
	@NotNull
	@Column(name = "hired_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date hiredDate;
	
	@Column(name = "suspend_date", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date suspendDate;
	
	@NotNull @NotEmpty
	@Column(length = 45, nullable = false)
	private String division;
	
	@NotNull @NotEmpty
	@Column(length = 45, nullable = false)
	private String grade;
	
	@NotNull @NotEmpty
	@Column(length = 45, name = "sub_division", nullable = false)
	private String subDivision;
	
	@NotNull @NotEmpty
	@Column(length = 20, nullable = false)
	private String status;
	
	
	@Column(nullable = true)
	@Type(type="text")
	private String photo;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "loc_id", nullable = false)
	private Location location;

	public Employee() {
		
	}

	public Employee(String empId, String firstName, String lastName, String gender, Date dateOfBirth, String nationality,
			String maritalStatus, String phone, String email, Date hiredDate, Date suspendDate, String division,
			String grade, String subDivision, String status, String photo, Location location) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.maritalStatus = maritalStatus;
		this.phone = phone;
		this.email = email;
		this.hiredDate = hiredDate;
		this.suspendDate = suspendDate;
		this.division = division;
		this.grade = grade;
		this.subDivision = subDivision;
		this.status = status;
		this.photo = photo;
		this.location = location;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getmaritalStatus() {
		return maritalStatus;
	}

	public void setmaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public Date getSuspendDate() {
		return suspendDate;
	}

	public void setSuspendDate(Date suspendDate) {
		this.suspendDate = suspendDate;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSubDivision() {
		return subDivision;
	}

	public void setSubDivision(String subDivision) {
		this.subDivision = subDivision;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
