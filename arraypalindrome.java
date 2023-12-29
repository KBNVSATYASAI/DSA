package Arraysbasics;

import java.util.Scanner;

public class arraypalindrome {

	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		size=sc.nextInt();
		int i;
 		int arr[] =new int[size];
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	int rev=0;
	rev=rev*10+arr[i]%10;
	}

}
