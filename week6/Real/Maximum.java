//package p1;

import java.util.Scanner;
class Maximum{
	public int max(int a, int b, int c){
		return a>b?(a>c?a:c):(b>c?b:c);
	}	
	public float max(float a,float b,float c){
		return a>b?(a>c?a:c):(b>c?b:c);
	}	

	public int max(int array[]){
		int n = array.length;
		int large=0;
		for(int i=0;i<n;i++){
			if(large<array[i]){
				large = array[i];
			}
		}
		return large;
	}

	public int max(int mat[][]){
		int r = mat.length;
		int c = mat[0].length;
		int large = 0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(large<mat[i][j])
					large = mat[i][j];
			}
		}
		return large;
	}
}

class MaximumDemo extends Maximum{
	public static void main(String[] args) {
		Maximum m1 = new Maximum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int ans = m1.max(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Maximum of them: "+ ans);
		System.out.println("Enter three floats: ");
		float fans = m1.max(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		System.out.println("Maximum of them: " + ans);
	}
}