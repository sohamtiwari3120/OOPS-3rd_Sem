package com.course.structure;
public class School extends Building{
	private int classNo;
	private int gradeLevel;

	public void setClassNo(int c){
		classNo = c;
	}

	public void setGradeLevel(int g){
		gradeLevel = g;
	}

	public int getClassNo(){
		return classNo;
	}

	public int getGradeLevel(){
		return gradeLevel;
	}
}