/* package whatever; // don't place package name! */

import java.util.*;
import java.io.*;

class Demo_Solution{
public static void main(String args[]){
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter String S");
	String S = reader.next();
	do{
		System.out.println("Enter String T");
		String T = reader.next();
		//System.out.println(S + "    " + T);
    //getting lengths of both of the strings
		int s = S.length();	
		int t = T.length();
		System.out.println(Demo_Solution.check_anagrams(s,t,S,T));
	}while(reader.next().equals("Y"));
}

//function to check string T is substring of string S or not
public static boolean is_substr(String s, String t){
	char[] s_char = s.toCharArray();
	Arrays.sort(s_char);
	String sorted_s = String.valueOf(s_char);
	char[] t_char = t.toCharArray();
	Arrays.sort(t_char);
	String sorted_t = String.valueOf(t_char);
	//System.out.println(sorted_s.equals(sorted_t));
	return(sorted_s.equals(sorted_t));
}

//function to make substrings of String S as the same size of String T
public static boolean check_anagrams(int s, int t, String S1, String T1){
	boolean flag = false;
	for(int i=0; i<=(s-t); i++){
		if(Demo_Solution.is_substr(S1.substring(i,t+i),T1))
		{
			flag = true;
			break;
		}
		else{
			flag = false;
			//break;
		}
	}
	return flag;
}

}
