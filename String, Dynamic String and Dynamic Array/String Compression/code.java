import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String ans="";
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				continue;
			else
				ans+=str.charAt(i);
		}
		ans+=str.charAt(str.length()-1);
		return ans;
	}

	public static String compression2(String str){
		String ans="";
		int cnt=1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1))
				cnt++;
			else {
				ans+=str.charAt(i);
				if(cnt!=1)
					ans+=cnt;
				cnt=1;
			}
		}
		ans+=str.charAt(str.length()-1);
		if(cnt!=1)
			ans+=cnt;
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
