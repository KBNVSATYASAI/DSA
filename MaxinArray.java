package Arraysbasics;

import java.util.Scanner;

public class MaxinArray {
	public static void main(String[] args) {
		
		System.out.println("enter array lenth");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	int	max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("max element is"+max);
	}

}
