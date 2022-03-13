import java.io.*;
import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str) {
		String ans="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				ans+=Character.toLowerCase(str.charAt(i));
			else
				ans+=Character.toUpperCase(str.charAt(i));
		}
		return ans;
	}

}
