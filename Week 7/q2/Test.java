import java.util.Scanner;
class InvalidDayException extends Exception{
	InvalidDayException(String m){
		super(m);
	}
}

class InvalidMonthException extends Exception{
	InvalidMonthException(String m){
		super(m);
	}
}

class CurrentDate{
	int day, month, year;
	void createDate(int d, int m,int y) throws InvalidDayException, InvalidMonthException{
		

		if(d<32 && d>0 && m<12 && m > 0){
			day = d;
			month = m;
			year = y;
		}

		else if(d>31||d<0){
			throw new InvalidDayException("Day should be between 1 and 31");
		}
		else if(m>12 || m< 0){
			throw new InvalidMonthException("asdfasf");
		}

	}
}

class Test{
	public static void main(String[] args) {
		CurrentDate currD = new CurrentDate();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter day, month, year: ");

		try{
			currD.createDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println("Current Date: "+ currD.day + " " + currD.month + " " + currD.year);
		}catch(InvalidMonthException m){
			m.printStackTrace();
		}catch(InvalidDayException m){
			m.printStackTrace();
		}
	}
}