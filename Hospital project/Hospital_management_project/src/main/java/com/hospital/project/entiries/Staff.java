package com.hospital.project.entiries;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="staff_table")
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int staff_id;
	@Column
	String staff_name;
	@Column
	String staff_email;
	@Column
	String staff_contact;
	@Column
	String staff_gender;
	@Column
	String staff_password;
	@Column
	Date staff_bdate;
	@Column
	Date staff_jdate;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	Department department;	
	@OneToMany(cascade = CascadeType.ALL)
	Set<Admission> admission =new HashSet();
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Staff(int staff_id, String staff_name, String staff_email, String staff_contact, String staff_gender,
			String staff_password, Date staff_bdate, Date staff_jdate, Department department,
			Set<Admission> admission) {
		super();
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.staff_email = staff_email;
		this.staff_contact = staff_contact;
		this.staff_gender = staff_gender;
		this.staff_password = staff_password;
		this.staff_bdate = staff_bdate;
		this.staff_jdate = staff_jdate;
		this.department = department;
		this.admission = admission;
	}

	public Date getStaff_bdate() {
		return staff_bdate;
	}

	public void setStaff_bdate(Date staff_bdate) {
		this.staff_bdate = staff_bdate;
	}

	public Date getStaff_jdate() {
		return staff_jdate;
	}

	public void setStaff_jdate(Date staff_jdate) {
		this.staff_jdate = staff_jdate;
	}

	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getStaff_email() {
		return staff_email;
	}
	public void setStaff_email(String staff_email) {
		this.staff_email = staff_email;
	}
	public String getStaff_contact() {
		return staff_contact;
	}
	public void setStaff_contact(String staff_contact) {
		this.staff_contact = staff_contact;
	}
	public String getStaff_gender() {
		return staff_gender;
	}
	public void setStaff_gender(String staff_gender) {
		this.staff_gender = staff_gender;
	}
	public String getStaff_password() {
		return staff_password;
	}
	public void setStaff_password(String staff_password) {
		this.staff_password = staff_password;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Set<Admission> getAdmission() {
		return admission;
	}
	public void setAdmission(Set<Admission> admission) {
		this.admission = admission;
	}

	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", staff_name=" + staff_name + ", staff_email=" + staff_email
				+ ", staff_contact=" + staff_contact + ", staff_gender=" + staff_gender + ", staff_password="
				+ staff_password + ", staff_bdate=" + staff_bdate + ", staff_jdate=" + staff_jdate + ", department="
				+ department + ", admission=" + admission + "]";
	}
	
	
	

}
