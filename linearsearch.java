package Arraysbasics;

import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:-");
		int size;
		size=sc.nextInt();
		int arr[] =new int[size];
	System.out.println("ENter elments in to array:-");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		}
	int key;
	System.out.println("enter key t find:-");
	key=sc.nextInt()	;
	for(int i=0;i<arr.length;i++) {
		if(key==arr[i])
			System.out.println(arr[i]);
		System.out.println("-1");

	}
 
 	
	}

}
