package com.javabydeveloper.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table(name="Teacher")
@Entity(name = "tea")


public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "ID")
	private Long teacherId;

	@Column(name = "NAME")
	private String Name;

	
	@Column(name = "SUBJECT")
	private String subject;
	
	@Column(name = "DEGREE")
	private String Degree;

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getSUBJECT() {
		return subject;
	}

	public void setSUBJECT(String subject) {
		this.subject = subject;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String Degree) {
		this.Degree = Degree;
	}


	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", Name=" + Name + ", SUBJECT=" + subject
				+ ", Degree=" + Degree + "]";
	}
	
}



