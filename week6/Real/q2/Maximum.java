package mypackages.p1;
public class Maximum{

	public  int max(int a, int b, int c){
		return a>b?(a>c?a:c):(b>c?b:c);
	}	

	public  float max(float a,float b,float c){
		return a>b?(a>c?a:c):(b>c?b:c);
	}	

	public  int max(int arr[]){
		int n = arr.length;
		int large=0;
		for(int i=0;i<n;i++){
			if(large<arr[i]){
				large = arr[i];
			}
		}
		return large;
	}

	public  int max(int mat[][]){
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
/*
class MaximumDemo extends Maximum{
	public static void main(String[] args) {

		Maximum m1 = new Maximum();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three integers: ");
		int ans = m1.max(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Maximum of them: "+ ans);

		System.out.println("Enter three floats: ");
		float fans = m1.max(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		System.out.println("Maximum of them: " + fans);

		System.out.println("Enter size of arr: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		ans = m1.max(arr);
		System.out.println("Maximum element in arr: " + ans);

		System.out.println("Enter r and c size of matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[r][c];

		System.out.println("Enter the elements: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				mat[i][j] = sc.nextInt();
			}
		}

		ans = m1.max(mat);
		System.out.println("Maximum element in matrix: " + ans);
	}
}*/