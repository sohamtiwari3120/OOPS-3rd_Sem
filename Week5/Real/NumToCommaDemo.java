import java.util.*;
class NumToCommaDemo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String s = sc.next();
		int l = s.length();
		String result="", temp="";
		for(int i =l-1;i>=0;i--)
		{
			if(temp.length()<3)
			{
				temp = s.charAt(i) + temp;
			}
			else 
			if(temp.length()==3)
			{
				result=","+temp+result;
				temp="";
				i++;
			}	
		}
		result=temp+result;
		if(result.charAt(0)==',')
			result=result.substring(1,result.length());
		System.out.println("The resultant string is : "+result);
	}
}