package com.chemistry.PeriodicTable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chemistry.PeriodicTable.model.PeriodicTable;
import com.chemistry.PeriodicTable.repository.PeriodicTableRepository;

@Service
public class PeriodicTableService {

	@Autowired
	PeriodicTableRepository pTableRepo;
	
	//CREATE ELEMENTS
	public PeriodicTable addElement(PeriodicTable element) {
		return pTableRepo.save(element);
	}
	
	//READ ELEMENTS
	public List<PeriodicTable> getElements() {
		return pTableRepo.findAll();
	}
	
	//READ ELEMEMT BY ATOMIC NUMBER
	public PeriodicTable getByAtomicNum(Short atomicNumber) {
		return pTableRepo.getById(atomicNumber);
		
	}
	
	//UPDATE ELEMENT
    public PeriodicTable updateElement(Short atomicNumber, PeriodicTable elementInfo) {
            PeriodicTable element = pTableRepo.findById(atomicNumber).get();
            
            element.setAtomicWeight(elementInfo.getAtomicWeight());
            element.setBlock(elementInfo.getBlock());
            element.setElecConfig(elementInfo.getElecConfig());
            element.setElement(elementInfo.getElement());
            element.setGroup(elementInfo.getGroup());
            element.setPeriod(elementInfo.getPeriod());
            element.setSymbol(elementInfo.getSymbol());
            
            
            return pTableRepo.save(element);                                
    }
    
    //DELETE
    public void deleteElement(Short atomicNumber) {
    	pTableRepo.deleteById(atomicNumber);
    }
	
	
	
}
