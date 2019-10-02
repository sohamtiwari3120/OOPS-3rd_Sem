import java.util.Scanner;
class RowSum implements Runnable{

	Thread t;
	int arr[];
	int sum;

	RowSum(int arr[]){
		this.arr = arr;
		t = new Thread(this);
		t.start();
	}

	public void run(){
		sum=0;
		for(int x : arr){
			sum+=x;
		}
	}
}

class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of matrix r, c: ");

		int mat[][] = new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Enter elements: ");
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[i].length;j++)
				mat[i][j] = sc.nextInt();

		int sum=0;
		System.out.println("Entered matrix: ");
		for(int x[] : mat){
			for(int y : x){
				System.out.print(y + " ");
			}System.out.println();
		}

		RowSum r[]= new RowSum[mat.length];
		
		for(int i=0;i<mat.length;i++){
			r[i] = new RowSum(mat[i]);
		}

		System.out.println("Sum of individual elements: ");
		for(RowSum x : r){
			try{
				x.t.join();
				System.out.println(x.sum);
				sum+=x.sum;
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Total sum: " + sum);
	}
}