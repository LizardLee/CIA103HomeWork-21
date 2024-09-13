package hw4;

import java.util.Arrays;

public class Hw4_1 {
	
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	
	public static void main( String[] args ) {
		
		int[] n = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15} ;
		int sum = 0 ;
		
		for( int i =0 ; i < n.length ; i++ ) {
			sum += n[i] ;
		}
		int avg ;
		avg = sum/n.length ;
		System.out.println("平均值為" + avg);
		
		Arrays.sort(n);
		for( int i =0 ; i < n.length ; i++ ) {
			if( n[i] > avg)System.out.print(n[i] + " ");
		}
	}
	
}
