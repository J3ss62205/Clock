package cs141.jlhenry2;

public class Clock {
	private int hour;
	private int min;
	private int sec;
	
	public Clock() {
		hour = 0;
		min = 0;
		sec = 0;
		//It is midnight by default 00:00:00
		
	}
	
	public Clock(int newHour,int newMin,int newSec) {
		hour = newHour;
		min = newMin;
		sec = newSec;
		//This is when you give the clock information 
		System.out.println();
		System.out.println("------The Second Clock!------");
		
		setMin(newMin);
		setHour(newHour);
		setClock(totalSec());
		Tick();
		
		System.out.println("------------------------------");
	}
	
	public Clock(int newSec) {
		sec = newSec;
		//This is when you just give the seconds 
		System.out.println();
		System.out.println("-------The First Clock!-------");
		
		setClock(totalSec());
		Tick();
		
		System.out.println("------------------------------");
	}
	
	public void setClock(int newSec) {
		int newMins;
		
		//This will set the seconds 

		newSec %= 86400;
		if(newSec < 0) {
			newSec += 86400;
		}
		
		sec = newSec % 60; //gets the seconds
		
		newMins = newSec / 60; //gets the minutes ... sike
		min = newMins % 60; //gets the minute
		
		hour = newMins / 60; //gets the hours
		
				
	}
	
	public int totalSec() {
		return (hour * 3600) + (min * 60) + sec;

	}
	
	public void addClock(Clock c) {
		
		setClock(totalSec() + c.totalSec());
		//adds a clock
		
	}
	
	public void subtractClock(Clock c) {
		
		setClock(totalSec() - c.totalSec());
		//subtracts a clock
	}
	
	public int getHour() {
		return hour;
		//This'll return the hours
	}
	
	public void setHour(int newHour) {
		hour = newHour;
		//This will set the hours
	}
	
	public int getSec() {
		return sec;
		//This'll return the seconds
	}
	
	public void setSec(int newSec) {
		sec = newSec;
		//This will set the seconds
	}
	
	public int getMin() {
		return min;
		//This'll return the minutes
	}
	
	public void setMin(int newMin) {
		min = newMin;
		//This will set the minutes
	}
	
	public void Tick() {
		for (int i = 0; i < 10; i++) {
			setClock(totalSec() + 1);
			print();
		}
		//This'll increase seconds by one in the clock method 
	}
	
	public void tickDown() {
		for (int i = 0; i < 10; i++) {
			setClock(totalSec() - 1);
			print();
		}
		//This'll decrease seconds by one in the clock method
	}
	
	
	
	public void print() {
		System.out.printf("(%02d", hour);
		System.out.printf(":%02d", min);
		System.out.printf(":%02d)\n",sec);
		//This should print like this for example 00:00:00 and then new line 
	}

}
