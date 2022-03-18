import java.io.*;
import java.util.*;

public class Main {

	public static boolean checkPrime(int num) {
		boolean isPrime = true;
		for(int i=2;i*i<=num;++i) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void solution(ArrayList<Integer> al){
		for(int i=al.size()-1;i>=0;--i) {
			int val = al.get(i);
			boolean isPrime = checkPrime(val);
			if(isPrime==true)
				al.remove(i);
		}

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
