package hw4;

import java.util.Scanner;

public class Hw4_5 {

//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	
		public static  void main(String[] args) {
	
				int year;
				int month;
				int day;
	
				Scanner sc = new Scanner(System.in);
				System.out.println("請分別輸入西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天");
			
				while(true) {
						if(sc.hasNextInt()) {
								year = sc.nextInt();
								if(year>=0 && year<10000){
										break;
								}else {
									
											System.out.println("請重新輸入年份(yyyy)");
											sc.next();
								}
						}else {
									System.out.println("請重新輸入年份(yyyy)");
									sc.next();	
						}
				}
				while(true) {
						if(sc.hasNextInt()) {
								month = sc.nextInt();
								if(month>0 && month<=12){
										break;
								}else{
									  System.out.println("請重新輸入月份(mm)");
									  sc.next();
								}
						}else{
							System.out.println("請重新輸入月份(mm)");
							sc.next();
						}
				}
				days:
				while(true) {
						if(sc.hasNextInt()) {
								day = sc.nextInt();
								switch(month) {
										case 1: case 3: case 5: case 7: case 8: case 10: case 12:
												if(day>0 && day<=31) break days;
												else {
														System.out.println("請重新輸入日期(dd)");
														sc.next();
														break;
												}
										case 4: case 6: case 9: case 11:
												if(day>0 && day<=30) break days;
												else {
														System.out.println("請重新輸入日期(dd)");
														sc.next();
														break;
												}
										default :
												if(year%4 == 0 && year%100 != 0) {
														if(day>0 && day<=29) break days;
														else {
																System.out.println("請重新輸入日期(dd)");
																sc.next();
																break;
														}
												}else if(year%400 == 0 || year%1000 == 0) {
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
				}
				
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
