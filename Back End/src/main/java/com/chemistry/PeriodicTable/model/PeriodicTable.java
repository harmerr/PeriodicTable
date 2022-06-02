package com.chemistry.PeriodicTable.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ChemicalElements")
public class PeriodicTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Atomic Number")
	public Short atomicNumber;
	
	@Column(name="Element")
	public String element;
	
	@Column(name="Symbol")
	public String symbol;
	
	@Column(name="Electron Configuration")
	public String elecConfig;
	
	@Column(name="Atomic Weight")
	public Float atomicWeight;
	
	@Column(name="`Group`")
	public Byte group;
	
	@Column(name="Period")
	public Byte period;
	
	@Column(name="`Block`")
	public Character block;
	
	public PeriodicTable() {}
	
	public PeriodicTable(String element, String symbol, String elecConfig, Float atomicWeight,
			Byte group, Byte period, Character block) {
		this.element = element;
		this.symbol = symbol;
		this.elecConfig = elecConfig;
		this.atomicWeight = atomicWeight;
		this.group = group;
		this.period = period;
		this.block = block;
	}

	public Short getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(Short atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getElecConfig() {
		return elecConfig;
	}

	public void setElecConfig(String elecConfig) {
		this.elecConfig = elecConfig;
	}

	public Float getAtomicWeight() {
		return atomicWeight;
	}

	public void setAtomicWeight(Float atomicWeight) {
		this.atomicWeight = atomicWeight;
	}

	public Byte getGroup() {
		return group;
	}

	public void setGroup(Byte group) {
		this.group = group;
	}

	public Byte getPeriod() {
		return period;
	}

	public void setPeriod(Byte period) {
		this.period = period;
	}

	public Character getBlock() {
		return block;
	}

	public void setBlock(Character block) {
		this.block = block;
	}
	
}
