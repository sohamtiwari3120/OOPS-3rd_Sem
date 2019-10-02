class Person{
	private String name;
	private int birthDate;
	void getName(){
		return name;
	}

	void getBirthDate(){
		return birthDate;
	}

	Person(){
		name = "";
		birthDate = 0;
	}
}

class CollegeGraduate extends Person{
	private float gpa;
	private int yearOfGrad;
	void getGpa(){
		return gpa;
	}
	void getyog(){
		return yearOfGrad;
	}

	CollegeGraduate(){
		gpa = 0;
		yearOfGrad = 0;
	}
}

class PersonDemo{
	public static void main(String args[]){
		
	}
}