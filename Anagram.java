package learning;
import java.util.*;
public class Anagram {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s1=sc.next();
	String s2= sc.next();
	int flag=0;
	if(s1.length()!=s2.length())
		System.out.println("Not Anagram");
	else
	{
		int count[] =  new int[26]; 
		// Assuming only lowercase English letters

	    // Count the frequency of characters in the first string
	    for (int i = 0; i < s1.length(); i++) {
	        count[s1.charAt(i) - 'a']++;
	    }

	    // Decrement the count for characters in the second string
	    for (int i = 0; i < s2.length(); i++) {
	        count[s2.charAt(i) - 'a']--;
	    }

	    // If all counts are 0, the strings are anagrams.
	    for (int i = 0; i < 26; i++) {
	        if (count[i] != 0) {
	           flag=1;
	        }
	    }

		System.out.println((flag==0)? "Anagram":"Not Anagram");

	}
	sc.close();
}
}
