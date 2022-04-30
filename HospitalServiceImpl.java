package com.example.demo.service;


import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hospital;
import com.example.demo.repository.HospitalRepository;
@Service
public  class HospitalServiceImpl implements HospitalService{
	 @Autowired
		private HospitalRepository hospitalRepository;
		@Override
		public Hospital saveHospital(Hospital  hospital) {
			
			return  hospitalRepository.save( hospital);
		}
		@Override
		public List<Hospital> fetchHospitalList() {
			return  hospitalRepository.findAll();
		}
		@Override
		public  Hospital fetchHospitalById(Long did) {
			return  hospitalRepository.findById(did).get();
		}
		@Override
		public void deleteHospitalById(Long did) {
		  hospitalRepository.deleteById(did);
			
		}
		//@Override
	/*public Hospital updateHospital( Long did, Hospital  hospital) {
			Hospital depDB= hospitalRepository.findById(did).get();
			if(Objects.nonNull( hospital.getHospitalName()) && !"".equalsIgnoreCase(hospital.getHospitalName())) {
				depDB.setHospitalName(hospital.getHospitalName());
				
			}
			
			
			return  hospitalRepository.save(depDB);
		}
		/*@Override
		public Hospital fetchHospitalByName(String  hospitalName) {
			return  hospitalRepository.findByHospitalName( hospitalName);
		}*/
		//@Override
		/*public Hospital updateHospital(Integer id, Hospital hospital) {
			// TODO Auto-generated method stub
			return null;
		}
		//@Override
		/*public Hospital fetchHospitalByName(String hospitalName) {
			// TODO Auto-generated method stub
			return null;
		}
*/
	
}

	