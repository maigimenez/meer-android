package com.i3m.dicomform.model;

import java.util.ArrayList;

public class InjuryGroup {
	private String type;
	private Boolean unique;
	private ArrayList<Injury> injuries;
	

	/* Constructors */
	public InjuryGroup(String type, Boolean unique, ArrayList<Injury> injuries) {
		super();
		this.type = type;
		this.unique = unique;
		this.injuries = injuries;
	}
	public InjuryGroup(String type, Boolean unique) {
		super();
		this.type = type;
		this.unique = unique;
		this.injuries = null;
	}

	/* Getters & setters */
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getUnique() {
		return unique;
	}
	public void setUnique(Boolean unique) {
		this.unique = unique;
	}
	public ArrayList<Injury> getInjuries() {
		return injuries;
	}
	public void setInjuries(ArrayList<Injury> injuries) {
		this.injuries = injuries;
	}
	
	

}
