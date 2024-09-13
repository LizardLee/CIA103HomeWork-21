package hw4;

import java.util.Scanner;

public class Hw4_5_1 {

    private int year;
    private int month;
    private int ms; //month size:  1=big; 2=feb; 3=small
    private int day;
    private boolean leepYear;

    public int getYear() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (sc.hasNextInt()) {
                year = sc.nextInt();
                if (year >= 0 && year < 10000) {
                    sc.close();
                    break;
                } else {
                    System.out.println("請重新輸入年份(yyyy)");
                    sc.next();
                }
            } else {
                System.out.println("請重新輸入年份(yyyy)");
                sc.next();
            }
        }
        return year;
    }
    
    public boolean getLeepYear() {
        
    	int y =year;
        if(y%4== 0 && y%100!= 0) {
            leepYear=true;
        }else if(y%400== 0 || y%1000==0) {
            leepYear=true;
        }else {
            leepYear=false;
        }
        return leepYear;
    }
    public int getMonth() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            if (sc.hasNextInt()) {
                month = sc.nextInt();
                if (month > 0 && month <= 12) {
                    sc.close();
                    break;
                } else {
                    System.out.println("請重新輸入月份(mm)");
                    sc.next();
                }
            } else {
                System.out.println("請重新輸入月份(mm)");
                sc.next();
            }
        }return month;
    }
    
    public int getMonthSize() {
        
    	int m =month;
        if(m==2) {
            ms=2;
        }else if(m==4 || m==6 || m==9 || m==11) {
            ms=3;
        }else {
            ms=1;
        }return ms;
    }
    
    public int getDay(){
        
        Scanner sc = new Scanner(System.in);
        days:
        while (true) {
            if (sc.hasNextInt()) {
            	day = sc.nextInt();
                switch(ms) {
                case 1:
                	if(day>0 && day<=31) break days;
					else {
							System.out.println("請重新輸入日期(dd)");
							sc.next();
							break;
					}
                case 3:
                	if(day>0 && day<=30) break days;
					else {
							System.out.println("請重新輸入日期(dd)");
							sc.next();
							break;
					}
                case 2:
                	if(leepYear) {
                		if(day>0 && day<=29) break days;
						else {
								System.out.println("請重新輸入日期(dd)");
								sc.next();
								break;
						}
                	}else 	if(day>0 && day<=28) break days;
					else {
						System.out.println("請重新輸入日期(dd)");
						sc.next();
						break;
					}
                }
            }else{
			System.out.println("請重新輸入日期(dd)");
			sc.next();
            }
        }sc.close();
        return day;
    }
}
