package com.nestjavatraining.entity;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nestjavatraining.springfoundation.BaseballCoach;
import com.nestjavatraining.springfoundation.Coach;
import com.nestjavatraining.springfoundation.CricketCoach;
import com.nestjavatraining.springfoundation.HockeyCoach;

public class CoachApp {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		Coach theCoach;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("---------------------------------------------------------------------");
		int continueChoice;
		do {
			System.out.println("Enter the choice\n");
			System.out.println("1.Cricket Coach\n2.Hockey Coach\n3.Baseball Coach");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Cricket Coach\n");
				theCoach= context.getBean("cricketCoach",CricketCoach.class);
				System.out.println("Daily Workout : "+theCoach.getDailyWorkout()+"\n"+"Daily Fortune : "+theCoach.getDailyFortune());
				break;
			case 2: 
				System.out.println("Hockey Coach\n");
				theCoach=context.getBean("hockeyCoach",HockeyCoach.class);
				System.out.println("Daily Workout : "+theCoach.getDailyWorkout()+"\n"+"Daily Fortune : "+theCoach.getDailyFortune());
				break;
			case 3: 
				System.out.println("Baseball Coach\n");
				theCoach=context.getBean("baseBallCoach",BaseballCoach.class);
				System.out.println("Daily Workout : "+theCoach.getDailyWorkout()+"\n"+"Daily Fortune : "+theCoach.getDailyFortune());
				break;
			
			}
			
			System.out.println("\nDo you want continue ?\n1.Yes\n2.No");
			continueChoice=scanner.nextInt();
		} while (continueChoice==1);
		context.close();
		System.out.println("---------------------------------------------------------------------");


}
}



