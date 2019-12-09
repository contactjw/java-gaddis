package chapter8;

public class Month {
	private int monthNumber;
	
	public Month() {
		monthNumber = 1;
	}
	
	public Month(int m) {
		if (m < 1 || m > 12)
			monthNumber = 1;
		else
			monthNumber = m;
	}
	
	public Month(String m) {
		switch (m) {
			case "January":
				monthNumber = 1;
				break;
			case "February":
				monthNumber = 2;
				break;
			case "March":
				monthNumber = 3;
				break;
			case "April":
				monthNumber = 4;
				break;
			case "May":
				monthNumber = 5;
				break;
			case "June":
				monthNumber = 6;
				break;
			case "July":
				monthNumber = 7;
				break;
			case "August":
				monthNumber = 8;
				break;
			case "September":
				monthNumber = 9;
				break;
			case "October":
				monthNumber = 10;
				break;
			case "November":
				monthNumber = 11;
				break;
			case "December":
				monthNumber = 12;
				break;
			default:
				monthNumber = 1;
				break;
		}
	}
	
	public void setMonth(int m) {
		if (m < 1 || m > 12)
			monthNumber = 1;
		else
			monthNumber = m;
	}
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public String getMonthName() {
		String month = "";
		switch (monthNumber) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "January";
			break;
		}
		
		return month;
	}
	
	public String toString() {
		String month = getMonthName();
		return month;
	}
	
	public boolean equals(Month m) {
		boolean isEqual;
		if (this.monthNumber == m.monthNumber)
			isEqual = true;
		else
			isEqual = false;
		
		return isEqual;
	}
	
	public boolean greaterThan(Month m) {
		boolean isGreater;
		if (this.monthNumber > m.monthNumber)
			isGreater = true;
		else
			isGreater = false;
		
		return isGreater;
	}
	
	public boolean lessThan(Month m) {
		boolean isLess;
		if (this.monthNumber < m.monthNumber)
			isLess = true;
		else
			isLess = false;
		
		return isLess;
	}
}
