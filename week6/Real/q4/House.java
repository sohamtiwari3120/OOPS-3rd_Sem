package com.course.structure;
public class House extends Building{
	private int bedNo;
	private int bathNo;

	public void setBedNo(int b){
		bedNo = b;
	}

	public void setBathNo(int ba){
		bathNo = ba;
	}

	public int getBedNo(){
		return bedNo;
	}

	public int getBathNo(){
		return bathNo;
	}
}