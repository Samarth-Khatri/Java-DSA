import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
    public static void main (String[] args) throws IOException {
        Scanner scn= new Scanner(System.in);
            int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
                num[i] = scn.nextInt();
            }
        int k = scn.nextInt();
        solve(n,num,k);
 	  }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array,n length of array and k.
    // It should print required output.
    public static void solve(int n,int[] arr,int k){

        // Approach 1 -> Tc = NlogN + klogN, Sc = O(N)
 	    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : arr) 
            pq.add(val);
        
		int i=0;
        while(pq.size()>0 && i<k) {
            System.out.print(pq.remove() + " ");
            i++;
        }

        // Approch 2 -> Tc = O(klogk) + O(n-klogk), Sc = O(k) = Better
        PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<k;++i)
			pq.add(arr[i]);

		for(int i=k;i<n;++i)
			if(arr[i] > pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}

		int []ans = new int[k];
		int i=0;
		while(pq.size()>0) {
            ans[i] = pq.remove();
			i++;
		}

		for(int j=ans.length-1;j>=0;--j)
			System.out.print(ans[j] + " ");
    }
 }