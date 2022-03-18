import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		int n = str.length();
		int f = factorial(n);
		for(int i=0;i<f;++i) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for(int d=n; d>=1; d--) {
				int q = temp/d;
				int r = temp%d;
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				temp=q;
			}
			System.out.println();
		}
	}

	public static int factorial(int n) {
		int val=1;
		for(int i=2;i<=n;++i) {
			val*=i;
		}
		return val;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
