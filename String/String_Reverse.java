package String;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No");

    }
}
