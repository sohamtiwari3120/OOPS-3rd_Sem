import mypackages.p1.Maximum;
import java.util.Scanner;
class MaximumDemo{
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
}