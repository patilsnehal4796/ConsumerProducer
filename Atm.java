package com.cjc.model;



public class Atm
{
	private int atmid;
	private String atmname;
	private int atmpin;
	
	public int getAtmid() {
		return atmid;
	}
		
	public void setAtmid(int atmid) {
		this.atmid = atmid;
	}
	public String getAtmname() {
		return atmname;
	}
	public void setAtmname(String atmname) {
		this.atmname = atmname;
	}
	public int getAtmpin() {
		return atmpin;
	}
	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}
	@Override
	public String toString() {
		return "Atm [atmid=" + atmid + ", atmname=" + atmname + ", atmpin=" + atmpin + "]";
	}


}
