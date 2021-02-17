//To convert days to seconds [Programme]
package com.company;
import java.util.Scanner;
public class Main
{
    public  static void main(String args[])
    {
        int i, hours, minutes, seconds;
        System.out.println("TIME CONVERTOR");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        i = sc.nextInt();
        seconds = i*24*60*60;
        System.out.print("The seconds in given days: ");
        System.out.println(seconds);
    }
}