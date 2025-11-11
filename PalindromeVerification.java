package Palindrome;
import java.util.Scanner;
public class PalindromeVerification
{
    public static void main (String[] arg)
    {
        String S=new String();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your word or number");
        S=Sc.nextLine();
        int i, j, temp;
        i=0;
        j=S.length()-1;
        temp=0;
        while (i<j && temp==0)
        {
            if (S.charAt(i)!=S.charAt(j))
                temp=1;
            i=i+1;
            j=j-1;
        }
        if (temp==0)
            System.out.println("it is a Palindrome");
        else
            System.out.println("its not a Palindrome");
    }



}
