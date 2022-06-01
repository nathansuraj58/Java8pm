package com.learning.OneToOneUnidirectional;

	 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="F_name",insertable=false,updatable=false)
	private String F_name;
	@Column(name="F_name")
	private String L_name;
	@Column(name="email")
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_detail_id")
	private TeacherDetails teacherdetails;
	
	public Teacher() {}
	public Teacher(String f_name, String l_name, String email) {
		super();
		F_name = f_name;
		L_name = l_name;
		this.email = email;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return F_name;
	}
	public void setF_name(String f_name) {
		F_name = f_name;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String l_name) {
		L_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public TeacherDetails getTeacherDetails() {
		return teacherdetails;
	}
	public void setTeacherDetails(TeacherDetails teacherDetails) {
		this.teacherdetails = teacherDetails;
	}
	
}
