package com.te.hibernate.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernate.jpa.beans.Doctor;

import com.te.hibernate.jpa.beans.Patient;

public class App {

	
	public static void main(String[] args) {
		   
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("DirectorUnit01");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Doctor doctor1=new Doctor();
		doctor1.setDoctorName("Mohan");
		doctor1.setDoctorSpecality("Heart Specialist");
		
		Doctor doctor2=new Doctor();
		doctor2.setDoctorName("Pranav");
		doctor2.setDoctorSpecality("Psychologist ");
         
		Doctor doctor3=new Doctor();
		doctor3.setDoctorName("Dr. P chandra");
		doctor3.setDoctorSpecality("General Physician");
	     
	    List<Doctor> docList=new ArrayList<Doctor>();
	    docList.add(doctor1);
	    docList.add(doctor2);
	    docList.add(doctor3);
	    
	    Patient patient=new Patient();
	    patient.setPatientName("Ankit");
	    Patient patient2=new Patient();
	    patient2.setPatientName("Pankaj");
	    Patient patient3=new Patient();
	    patient3.setPatientName("Mohan");
	    
	    List<Patient> paList=new ArrayList<Patient>();
	    paList.add(patient);
	    paList.add(patient2);
	    paList.add(patient3);
	    
	    patient.setDoctorList(docList);
	    doctor1.setPatientlist(paList);
	    patient2.setDoctorList(docList);
	    doctor2.setPatientlist(paList);
        patient3.setDoctorList(docList);
        doctor3.setPatientlist(paList);
        
	 	     entityTransaction.begin();	
	     	entityManager.persist(doctor1);
	     	entityManager.persist(doctor2);
	     	entityManager.persist(doctor3);
		entityTransaction.commit();
		
		
	}
}
