import java.util.Scanner;
interface Callable
{
	void makeAudioCall(String cellNum);
	void makeVideoCall(String cellNum);
}
class Phone
{
	String brand;
	int memCapacity;
	Phone(String brand, int memCapacity)
	{
		this.brand = brand;
		this.memCapacity = memCapacity;
	}
}

class BasicPhone extends Phone implements Callable{

	BasicPhone(String brand, int memCapacity)
	{
		super(brand, memCapacity);
	}
	public void makeAudioCall(String cellNum)
	{
		System.out.println("Basic phone making audio call to " + cellNum);
		System.out.println("audio call finished, please rate the quality of the call on the app store,oh sorry your phone does'nt have one!");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println("Can't make video call. Buy a better phone.");
	}
}

class SmartPhone extends Phone implements Callable
{

	SmartPhone(String brand, int memCapacity)
	{
		super(brand, memCapacity);
	}

	public void makeAudioCall(String cellNum)
	{
		System.out.println("Smart phone making audio call to " + cellNum );
		System.out.println("audio call finished, please rate the quality of the call on the app store");
	}

	public void makeVideoCall(String cellNum)
	{
		System.out.println("Smart phone making video call to " + cellNum);
		System.out.println("video call finished, please rate the quality of the call on the app store");
	}
}


class DemoQ1
{
public static void main(String[] args)
{
int ch,ch1;
String name;
int memcapacity;
String cellnum;
Scanner sc = new Scanner(System.in);
do{
System.out.println("enter the type of phone you have\n1:basic phone\n2:smartphone");
ch=sc.nextInt();
switch (ch)
{
	case 1:
	System.out.println("enter the brand name of your phone");
	name=sc.next();
	System.out.println("enter the memory capacity of your phone in GB");
	memcapacity=sc.nextInt();
	if(memcapacity>64)
	{
		System.out.println("your memory capacity is really good for a basic phone");
	}
	BasicPhone b=new BasicPhone(name,memcapacity);
	System.out.println("enter what do you want to do with your basic phone\n1:make audio call\n2:make video call");
	ch1=sc.nextInt();
	if(ch1==1)
	{
		System.out.println("enter the phone number you want to audio call");
		cellnum=sc.next();
		if(cellnum.length()!=10)
		{
			System.out.println("please enter valid mobile number");
			break;
		}
		b.makeAudioCall(cellnum);
	}
	else if(ch1==2)
	{
		System.out.println("enter the phone number you want to video call");
		cellnum=sc.next();
		if(cellnum.length()!=10)
		{
			System.out.println("please enter valid mobile number");
			break;
		}
		b.makeVideoCall(cellnum);
	}
	break;



	case 2:
	System.out.println("enter the brand name of your phone");
	name=sc.next();
	System.out.println("enter the memory capacity of your phone in GB");
	memcapacity=sc.nextInt();
	if(memcapacity<64)
	{
		System.out.println("your memory capacity is really bad for a smartphone");
	}
	SmartPhone s=new SmartPhone(name,memcapacity);
	System.out.println("enter what do you want to do with your smart phone\n1:make audio call\n2:make video call");
	ch1=sc.nextInt();
	if(ch1==1)
	{
		System.out.println("enter the phone number you want to audio call");
		cellnum=sc.next();
		if(cellnum.length()!=10)
		{
			System.out.println("please enter valid mobile number");
			break;
		}
		s.makeAudioCall(cellnum);
	}
	else if(ch1==2)
	{
		System.out.println("enter the phone number you want to video call");
		cellnum=sc.next();
		if(cellnum.length()!=10)
		{
			System.out.println("please enter valid mobile number");
			break;
		}
		s.makeVideoCall(cellnum);
	}
	break;
	default:
	System.out.println("please enter valid choice");

}
}while(ch!=4);
}
}
