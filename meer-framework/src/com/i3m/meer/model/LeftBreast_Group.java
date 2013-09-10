package com.i3m.meer.model;

import java.util.ArrayList;

public class LeftBreast_Group {
	private String type;
	private ArrayList<LeftBreast_Children> children;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ArrayList<LeftBreast_Children> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<LeftBreast_Children> children) {
		this.children = children;
	}
}
