import java.util.*;
class SeatsFilledException extends Exception{
	SeatsFilledException(String m){
		super(m);
	}
}
class Student
{
	static int count=25;
	int regNo;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa,cgpa;
	Student()
	{
		doj=new GregorianCalendar();
	}
	Student(String name, int year, int month, int day, short s, float g, float c) throws SeatsFilledException
	{
		this.name=name;
		count++;
		if(count>25){
			throw new SeatsFilledException("Seats are filled");
		}else{
			System.out.println("Data Saved");
		}
		doj = new GregorianCalendar(year, month-1, day);
		sem=s;
		gpa=g;
		cgpa=c;
		int y=year%10;
		year/=10;
		y=y+year%10*10;
		y*=100;
		regNo=y+count;
	}

}
class StudentDemo
{
	public static void main(String[] args) throws SeatsFilledException
	{
		
		Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter student info: ");
        
        Student s = new Student (sc.nextLine(), sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextShort(), sc.nextFloat(), sc.nextFloat());
        
	}	
}