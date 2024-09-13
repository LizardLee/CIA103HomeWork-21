package hw3;

import java.util.Scanner;

public class Hw3_2 {

//	• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	public static void main(String[] args ) {
	
			int theAnswer = ( int ) ( Math.random() * 99 + 1) ;
			Scanner sc = new Scanner( System.in ) ;
			System.out.println( "終極密碼!!請從\" 0 - 100 \"猜一個數字" ) ;
					
					int a = 0 , b = 100 ;
					int g ;
					while( true ) {
							if( sc.hasNextInt() ) {
									g = sc.nextInt() ;
									if( g > a && g < b ) {

											if( theAnswer == g ) {

													System.out.println( "BANG!!") ;
													sc.close () ;
													break ;

											}else if( theAnswer > g ) {

													a = g ;
													System.out.print( a + "到" + b ) ;									

														}else {
															
																b = g ;
																System.out.println( a + "到" + b ) ;																
														}
										
									}else 	System.out.println( "請輸入範圍內的整數") ;
									
							}else 	System.out.println( "請輸入範圍內的整數") ;
							
					}
	}
}
