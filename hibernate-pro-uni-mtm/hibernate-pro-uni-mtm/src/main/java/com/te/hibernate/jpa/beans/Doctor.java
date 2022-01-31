package com.te.hibernate.jpa.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId;
	@Column(name="doctor_name")
    private String doctorName;
	@Column(name="doctor_spec")
	private String doctorSpecality;
	public int getDoctorId() {
		return doctorId;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public Doctor() {
		super();
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorSpecality() {
		return doctorSpecality;
	}
	public void setDoctorSpecality(String doctorSpecality) {
		this.doctorSpecality = doctorSpecality;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Patient> patientlist;
	public List<Patient> getPatientlist() {
		return patientlist;
	}
	public void setPatientlist(List<Patient> patientlist) {
		this.patientlist = patientlist;
	}
	
	
	
}
