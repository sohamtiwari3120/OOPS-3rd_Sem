import java.util.Scanner;
class Phone{
	String brand;
	int memCapacity;

	Phone(String brand, int memCapacity){
		this.brand = brand;
		this.memCapacity = memCapacity;
	}

	interface Callable{
		void makeAudioCall(String cellNum);
		void makeVideoCall(String cellNum);
	}
}

class BasicPhone extends Phone implements Phone.Callable{

	String cellNum;

	BasicPhone(String brand, int memCapacity, String cellNum){
		super(brand, memCapacity);
		this.cellNum = cellNum;
	}
	public void makeAudioCall(String cellNum){
		System.out.println("Basic phone making audioCall " + cellNum);
	}

	public void makeVideoCall(String cellNum){
		System.out.println("Can't make video call. Buy a better phone.");
	}
}

class SmartPhone extends Phone implements Phone.Callable{

	String cellNum;

	SmartPhone(String brand, int memCapacity, String cellNum){
		super(brand, memCapacity);
		this.cellNum = cellNum;
	}

	public void makeAudioCall(String cellNum){
		System.out.println("Smart phone making audio call to " + cellNum );
	}

	public void makeVideoCall(String cellNum){
		System.out.println("Smart phone making video call " + cellNum);
	}
}


class DemoQ1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data for basic phone: 1. Name 2. MemC 3. PhoneNumber");
		String name = sc.nextLine();
		int memC = sc.nextInt();
		sc.nextLine();
		String cellNum = sc.nextLine();
		BasicPhone bp = new BasicPhone(name, memC, cellNum);
		System.out.println("Enter data for smart phone: 1. Name 2. MemC 3. PhoneNumber");
		name = sc.nextLine();
		memC = sc.nextInt();
		sc.nextLine();
		cellNum = sc.nextLine();
		SmartPhone sp = new SmartPhone(name, memC, cellNum);
		bp.makeAudioCall(bp.cellNum);
		bp.makeVideoCall(bp.cellNum);
		sp.makeAudioCall(sp.cellNum);
		sp.makeVideoCall(sp.cellNum);
	}
}
