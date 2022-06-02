package com.chemistry.PeriodicTable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chemistry.PeriodicTable.model.PeriodicTable;
import com.chemistry.PeriodicTable.service.PeriodicTableService;

@RestController
@RequestMapping(value="/elements", consumes="application/json")
public class PeriodicTableController {

	@Autowired
	PeriodicTableService pTableService;
	
	@GetMapping("/all")
	public List<PeriodicTable> getElements() {
		return pTableService.getElements();
	}
	
	@GetMapping("/{atomicNumber}")
	public PeriodicTable getElement(@PathVariable(value="atomicNumber") Short atomicNumber) {
		return pTableService.getByAtomicNum(atomicNumber);
	}
	
	@PostMapping("/add-element")
	public PeriodicTable addElement(@RequestBody PeriodicTable element) {
		return pTableService.addElement(element);
	}
	
	@PutMapping("/{atomicNumber}")
	public PeriodicTable updateElement(
			@PathVariable(value="atomicNumber") Short atomicNumber, 
			@RequestBody PeriodicTable newInfo) {
		return pTableService.updateElement(atomicNumber, newInfo);
	}
	
	@DeleteMapping("/{atomicNumber}")
	public void deleteElement(@PathVariable(value="atomicNumber") Short atomicNumber) {
		pTableService.deleteElement(atomicNumber);
	}
}
