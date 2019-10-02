import java.util.Scanner;
abstract class Figure{
	int dim1;
	int dim2;
	abstract int area();
}

class Rect extends Figure{
	Rect(int l, int b){
		dim1=l;
		dim2=b;
	}
	int area(){
		return dim1*dim2;
	}
}

class Sq extends Figure{
	Sq(int s){
		dim1=dim2=s;
	}
	int area(){
		return dim1*dim2;
	}
}

class Trig extends Figure{
	Trig(int l, int b){
		dim1=l;
		dim2=b;
	}
	int area(){
		return dim1*dim2/2;
	}
}

class FigureDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Figure figref;
		
		System.out.println("Enter l and b of rect");
		Rect r = new Rect(sc.nextInt(), sc.nextInt());
		figref = r;
		System.out.println("Area of rectangle: "+figref.area());

		System.out.println("Enter side of sq");
		Sq s = new Sq(sc.nextInt());
		figref = s;
		System.out.println("Area of square: "+figref.area());

		System.out.println("Enter sizes of right trig");
		Trig t = new Trig(sc.nextInt(),sc.nextInt());
		figref = t;
		System.out.println("Area of trig: "+figref.area());
	}
}