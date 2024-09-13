package hw4;

public class Hw4_5_2 {
	
	public static void main(String[] args) {
				
		Hw4_5_1 ts =new Hw4_5_1();
		
		int year=ts.getYear();
		ts.getLeepYear();
		int month=ts.getMonth();
		ts.getMonthSize();
		int day=ts.getDay();
		
		int sum = 0;
		switch(month-1) {
		case 11: sum +=30;
		case 10: sum +=31;
		case 9: sum +=30;
		case 8: sum +=31;
		case 7: sum +=31;
		case 6: sum +=30;
		case 5: sum +=31;
		case 4: sum +=30;
		case 3: sum +=31;
		case 2:
				if(year%4 == 0 && year%100 != 0) {
						sum +=29;
				}else if(year%400 == 0 || year%1000 == 0) {
									sum +=29;
							}else sum +=28;
		case 1: 
				sum +=31;
				break;		
		}
		sum+=day;
		
		System.out.println("第"+ sum+ "天");
	}

}
