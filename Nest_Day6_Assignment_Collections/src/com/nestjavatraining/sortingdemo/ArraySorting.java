package com.nestjavatraining.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		
		ArrayList <String> a= new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		
		
		for (int i=0;i<5;i++){
			System.out.println("Enter the name ");
			
			a.add(scanner.next());
		}
		Collections.sort(a);
		System.out.println("Sorted Names\n"+a);


	}

}
