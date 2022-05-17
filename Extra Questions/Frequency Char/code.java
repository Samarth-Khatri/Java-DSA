import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();

    int[]farr=new int[26];
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        int idx=ch-'a';
        farr[idx]++;
    }
    int maxIdx=0;
    for(int i=1;i<farr.length;i++){
        if(farr[i]>farr[maxIdx]){
            maxIdx=i;
      }
    }
    char mfc=(char)(maxIdx+'a');
    System.out.println(mfc);

  }
}
