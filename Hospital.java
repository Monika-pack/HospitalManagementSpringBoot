package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "admin")
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
     private String name;
     private String  patientgender;
	 private String  treatmentname;
	 private String  specialist;
	 private Long    apmntyme;
	 private String   operationblknum;
	 private  String  ptwrdnum;
	 private  Long    paidamnt;
	 private   Long   billamnt;
	 //        //
	 //private String HospitalName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPatientgender() {
		return patientgender;
	}
	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}
	public String getTreatmentname() {
		return treatmentname;
	}
	public void setTreatmentname(String treatmentname) {
		this.treatmentname = treatmentname;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Long getApmntyme() {
		return apmntyme;
	}
	public void setApmntyme(Long apmntyme) {
		this.apmntyme = apmntyme;
	}
	public String getOperationblknum() {
		return operationblknum;
	}
	public void setOperationblknum(String operationblknum) {
		this.operationblknum = operationblknum;
	}
	public String getPtwrdnum() {
		return ptwrdnum;
	}
	public void setPtwrdnum(String ptwrdnum) {
		this.ptwrdnum = ptwrdnum;
	}
	public Long getPaidamnt() {
		return paidamnt;
	}
	public void setPaidamnt(Long paidamnt) {
		this.paidamnt = paidamnt;
	}
	public Long getBillamnt() {
		return billamnt;
	}
	public void setBillamnt(Long billamnt) {
		this.billamnt = billamnt;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", patientgender=" + patientgender + ", treatmentname="
				+ treatmentname + ", specialist=" + specialist + ", apmntyme=" + apmntyme + ", operationblknum="
				+ operationblknum + ", ptwrdnum=" + ptwrdnum + ", paidamnt=" + paidamnt + ", billamnt=" + billamnt
				+ "]";
	}
/*	public String getHospitalName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setHospitalName(String hospitalName) {
		// TODO Auto-generated method stub
		
		//this.hospitalName=hospitalName;
	}*/
	
	}
	
	 
	 
