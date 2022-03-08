import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub = str.substring(i,j);
				isPalindrome(sub);
			}
		}
	}

	public static void isPalindrome(String ans){
		int i = 0;
		int j = ans.length()-1;
		while(j>i) {
			if(ans.charAt(i) != ans.charAt(j))
				return;
			i++; j--;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
