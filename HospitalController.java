package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.bean.Hospital;
import com.example.demo.entity.Hospital;
import com.example.demo.service.HospitalService;

@RestController
public class HospitalController<admin> {
@Autowired
	HospitalService hospitalService;
@PostMapping("/admin/")
    public Object saveHospital(@RequestBody Hospital hospital) {

return  hospitalService.saveHospital(hospital);
	
}

//get all patients Record
	@GetMapping("/admin")
	public List<Hospital> fetchHospitalList(){
		return hospitalService.fetchHospitalList();
	}
	
	//get patients by id
	@GetMapping("/admin/{id}")
	public Hospital fetchHospitalById(@PathVariable("id") Long did) {
		return hospitalService.fetchHospitalById(did);
	}
	
	//delete
	@DeleteMapping("/admin/{id}")
	public String deleteHospitalById(@PathVariable("id") Long did) {
		hospitalService.deleteHospitalById(did);
		return "Patient details  deleted Successfully";
	}
	//        //
	@PutMapping("/admin")
	public List<Hospital> fetchHospitalList1(){
		return hospitalService.fetchHospitalList();
	}
             
	//update
	@PutMapping("/admin/{id}")
	public Hospital updateHospitalById(@PathVariable("id") Long did) {
		//return hospitalService.updateHospital(did);
		return hospitalService.fetchHospitalById(did);
	}
	
		

	            
	//byname    
	/*@GetMapping("/admin/name/{name}")
	public Hospital fetchadminByName(@PathVariable("name") String hospitalName) {
		return hospitalService.fetchHospitalByName(hospitalName);
	}*/
	
	//                                         // 
	/*@RequestMapping(method=RequestMethod.PUT, value="/admin/{id}")
	public void updateHospital(@PathVariable Integer id, @RequestBody Hospital hospital) {
	System.out.println("id="+id);
		 hospitalService.updateHospital(id,hospital);
	}*/
}
