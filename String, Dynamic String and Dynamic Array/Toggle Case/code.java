import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str) {

		// METHOD 1 Using inbuilt UpperCase and LowerCase functions
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				ans+=Character.toLowerCase(str.charAt(i));
			else
				ans+=Character.toUpperCase(str.charAt(i));
		}
		return ans;


		// METHOD 2 Using StringBuilder and comparing ASCII values
		StringBuilder sb = new StringBuilder(str); //converted to stringbuilder
		for(int i=0;i<sb.length();++i) {
			char ch = sb.charAt(i);
			if(ch>='A' && ch<='Z') {
				char lc = (char)(ch + 'a'-'A'); //convert to lower ch
				sb.setCharAt(i,lc);
			} else {
				char uc = (char)(ch + 'A'-'a'); //convert to upper ch
				sb.setCharAt(i,uc);
			}
		}
		return sb.toString();
	}

}
