package introduction;

import java.util.Scanner;
/**
 * Created by swakkhar on 5/6/16.
 */

public class ScannerTest
{
    // main method
    public static void main(String args[])
    {
        System.out.println("Please enter a number:");
        Scanner myScanner=new Scanner(System.in);
        int myInt=myScanner.nextInt();
        System.out.println("This is an integer:"+myInt);

        boolean isPrime=true;
        for(int i=2;i< Math.sqrt(myInt);i++)
        {
            if(myInt%i==0) // check if the number is divisible
            {
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println("The number is Prime");
        else
            System.out.println("The number is not Prime");

    } // end of main
}// end of class ScannerTest


