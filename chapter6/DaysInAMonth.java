package chapter6;

public class DaysInAMonth {
	private int month;
	private int year;
	
	public DaysInAMonth(int m, int y) {
		month = m;
		year = y;
	}
	
	public int numberOfDays() {
		boolean leapYear = false;
		int numDays = 0;
		if (year % 100 == 0) {
			if (year % 400 == 0)
				leapYear = true;
		}
		else {
			if (year % 4 == 0)
				leapYear = true;
		}
		
		switch(month) {
			case 1:
				numDays = 31;
				break;
			case 2:
				if (leapYear == true) {
					numDays = 29;
					break;
				}
				else {
					numDays = 28;
					break;
				}
			case 3:
				numDays = 31;
				break;
			case 4:
				numDays = 30;
				break;
			case 5:
				numDays= 31;
				break;
			case 6:
				numDays = 30;
				break;
			case 7:
				numDays = 31;
				break;
			case 8:
				numDays = 31;
				break;
			case 9:
				numDays = 30;
				break;
			case 10:
				numDays = 31;
				break;
			case 11:
				numDays = 30;
				break;
			case 12:
				numDays = 31;
				break;
		}
		return numDays;
	}
}
