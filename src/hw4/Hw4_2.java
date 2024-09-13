package hw4;

import java.util.Scanner;

public class Hw4_2 {

//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
	
	public static void main(String[] args ) {
		
		System.out.println( "請輸入任意資訊" ) ;
		Scanner sc = new Scanner( System.in) ;
		
		String w = sc.nextLine() ;
		
		sc.close();
		
//		char[] letters = new char[ w.length() ] ;
//		
//		for( int i = 0 ; i < w.length() ; i++ ) {
////			letters[i] = w.charAt( i ) ;
//		}
		for( int i = w.length() - 1 ; i >= 0 ; i--) {
			System.out.print(w.charAt( i ));
		}
	}
}
