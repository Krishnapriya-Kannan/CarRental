package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.car.CarRental;
import com.webapp.demo.dao.CarRentalDao;

@RestController
public class CarRentalController {
	
	@Autowired
	CarRentalDao dao;
	@RequestMapping("/saveCar")
	@ResponseBody
	public void saveCar(@RequestParam String id,String model, String no,CarRental obj) {
		
		obj.setId(id);
		obj.setModel(model);
		obj.setNo(no);
		obj.setStatus("available");
		dao.save(obj);
		
	}
	
	@RequestMapping("/editCar")
	@ResponseBody
	public void editCar(@RequestParam String id,String model, String no) {
		
		
		dao.editCarDetails(id,model,no);
		
	}
	
	@RequestMapping("/deleteCar")
	@ResponseBody
	public void deleteCar(@RequestParam String id) {
		
		
		dao.deleteCar(id);
		
	}
	

	@RequestMapping("/getAll")
	@ResponseBody
	public List<CarRental> getAll() {
		
		return dao.findAll();
		
		
	}
	
	@RequestMapping("/getById")
	@ResponseBody
	public List<CarRental> getCarById(String id) {
		
		return dao.findById(id);
		
		
	}

}