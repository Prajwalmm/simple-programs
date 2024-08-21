package learning;
import java.util.*;
public class SumOfDigitsInString {
	protected static Scanner sc= new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the String :");
	String s=sc.nextLine();
	int sum=0;
	char [] arr = s.toCharArray();
	for(int i=0;i<s.length();i++) {
		if(arr[i]>='0' && arr[i]<='9') {
			sum+=arr[i]-'0';
	}
	}
	System.out.println("The total sum of the digits present in the string :"+sum);

}

}
