package Arraysbasics;

import java.util.Scanner;

public class consecutiveones {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size;
	System.out.println("enter size");
	size=sc.nextInt();
	int arr[] =new int[size];
	int i=0;
	int count=0;
	int max_count=0;
	for(i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	for(i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
count=0;
	}
	else {
		count++;
	}
	max_count=Math.max(max_count, count);
	}
	System.out.println(max_count);
}
}
