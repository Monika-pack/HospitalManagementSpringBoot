package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Hospital;

public interface HospitalService<admin> {

	admin saveHospital(Hospital hospital);

	List<Hospital> fetchHospitalList();

	Hospital fetchHospitalById(Long did);

	void deleteHospitalById(Long did);

	//Hospital updateHospital(Integer id, Hospital hospital);

	//Hospital fetchHospitalByName(String hospitalName);

//                          //                           //
//	Hospital fetchHospitalByName(String hospitalName);

	

	

	

	

	

	

}
