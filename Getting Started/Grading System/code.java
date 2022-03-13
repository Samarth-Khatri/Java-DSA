import java.util.*;

public class main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n>=90)
            System.out.println("excellent");
        else if (n>=80)
            System.out.println("good");
        else if (n>=70)
            System.out.println("fair");
        else if (n>=60)
            System.out.println("meets expectations");
        else if (n<60)
            System.out.println("below par");
    }
}
