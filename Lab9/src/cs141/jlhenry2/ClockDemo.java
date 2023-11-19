package cs141.jlhenry2;
import java.util.*;

public class ClockDemo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Clock[] clock = new Clock[3];
		//Creates an array
		
		int seconds;
		int minutes;
		int hours;
		//variables yayyyyyyyyyyyyyy
		
		System.out.println("-------Welcome to the Clock!-------");
		System.out.println("Please give me a number for seconds");
		do {
			System.out.println("It can be any number as long as it is not negative");
			seconds = scnr.nextInt();
		}while(seconds <= 0); 
		//This will check to make sure the seconds is positive
		System.out.println("Thank you :)");

		clock[0] = new Clock(seconds);
		//The first clock in the array! 

		
		System.out.println("Please give me another number for seconds");
		do {
			System.out.println("Please make sure it is anywhere from 0-59 as whole numbers");
			seconds = scnr.nextInt();
		}while(seconds > 59 || seconds <= 0); 
		//This will check to make sure the seconds is 0-59
		System.out.println("Thank you :)");
		//This gets seconds
		
		System.out.println("Please give me another number for minutes");
		do {
			System.out.println("Please make sure it is anywhere from 0-59 as whole numbers");
			minutes = scnr.nextInt();
		}while(minutes > 59 || minutes <= 0); 
		//This will check to make sure the minutes is 0-59
		System.out.println("Thank you :)");
		//This gets minutes 
		
		System.out.println("Please give me another number for hours");
		do {
			System.out.println("Please make sure it is anywhere from 0-23 as whole numbers");
			hours = scnr.nextInt();
		}while(hours > 23 || hours <= 0); 
		//This will check to make sure the hours is 0-23
		System.out.println("Thank you :)");
		//This gets minutes 
		
		clock[1] = new Clock(hours, minutes, seconds);
		
		clock[2] = new Clock();
		
		clock[0].addClock(clock [1]);
		//This will add the first two clocks together 
		
		System.out.println();
		System.out.println("---Clock 1 And Clock 2 Added Together!---");
		
		clock[0].Tick();//this'll print out the new added clock
		
		System.out.println("------------------------------");
		System.out.println();
		
		clock[2].subtractClock(clock [0]);
		
		System.out.println("---Clock 1 And Clock 2 Subtracted Together!---");
		
		clock[2].Tick();
		
		System.out.println("------------------------------");


		
	}

}
