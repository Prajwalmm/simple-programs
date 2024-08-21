package learning;

import java.util.Scanner;

public class palindromeUsingTwopointer {
	public static Scanner sc= new Scanner(System.in);
	public static boolean isPalindrome(String s)
	{ boolean flag=true;
		int i=0,j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j)) {
				flag=false;
			 break;
		}	
			i++;
			j--;
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String s=sc.next();
		if(isPalindrome(s)==true)
			System.out.println("It is palindrome");
		else if(isPalindrome(s)== false)
			System.out.println("It is not a palindrome");
	}

}
