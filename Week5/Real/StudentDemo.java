import java.util.*;
class Student
{
	static int count=0;
	int regNo;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa,cgpa;
	Student()
	{
		doj=new GregorianCalendar();
	}
	Student(String name, int year, int month, int day, short s, float g, float c)
	{
		this.name=name;
		count++;
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
	void display()
	{
		System.out.println();
		System.out.println("Reg. No = "+regNo);
		System.out.println("Name = "+ name);
		int y=doj.get(Calendar.YEAR);
		int m = doj.get(Calendar.MONTH)+1;
		int d=doj.get(Calendar.DAY_OF_MONTH);
		System.out.println("Date of joining = "+d+"/"+m+"/"+y);
		System.out.println("Sem = "+sem);
		System.out.println("Gpa = "+gpa);
		System.out.println("CGPA = "+cgpa);
		this.initialName();
		System.out.println();
	}
	void initialName()
	{
		String s = name;
		String result = s.charAt(0)+". "+s.charAt(s.indexOf(' ')+1)+". "+s.substring(s.lastIndexOf(' ')+1);
		System.out.println("Shortened name is: "+result);
	}
	void sortSemNCgpa(Student arr[])
	{
		Student temp;
		int n= arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j].sem>arr[j+1].sem)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				if(arr[j].sem==arr[j+1].sem)
					if(arr[j].cgpa>arr[j+1].cgpa)
					{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				    }
			}
		}
		for(int i=0;i<n;i++)
			arr[i].display();
	}
	void sortName(Student arr[])
	{
		int n =arr.length;
		Student temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j].name.compareTo(arr[j+1].name)>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			arr[i].display();
	}
	void startingChar(Student arr[])
	{
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting character below!");
		char c =sc.next().charAt(0);
		for(int i=0;i<n;i++)
			if(arr[i].name.charAt(0)==c)
				arr[i].display();
	}
	void chkSubStr(Student arr[])
	{
		int n =arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the substring below!");
		String sub = sc.nextLine();
		for(int i=0;i<n;i++)
			if(arr[i].name.indexOf(sub)!=-1)
				arr[i].display();
	}
}
class StudentDemo
{
	public static void main(String[] args) 
	{
		int size =3;
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[size];
		
        for(int i=0;i<size;i++){
        	System.out.println("\nEnter the " + (i+1) + " student info");
        	s[i] = new Student (sc.nextLine(), sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextShort(), sc.nextFloat(), sc.nextFloat());
        	sc.nextLine();
        }
		
		System.out.println("Sorting by sem and cgpa!");
		s[0].sortSemNCgpa(s);

		System.out.println("Sorting by name!");
		s[0].sortName(s);

		System.out.println("Searching by starting chracter!");
		s[0].startingChar(s);

		System.out.println("Searching by substring!");
		s[0].chkSubStr(s);
	}	
}