package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_3 {

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//
//	(提示:Scanner)
//	(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

	public static void main(String args[]) {
		
	System.out.println( "請依次輸入不想要的號碼\n如已完成輸入請輸入\"Y\""
			+ "\n系統將自動為您隨機選取六個號碼") ;
	
	Hw3_3 gogo = new Hw3_3() ;
	int[] lucky6 = gogo.getRandomLucky6() ;
	
	System.out.println( "幸運數字是:" + Arrays.toString( lucky6 ) ) ;
	}
	public  int[] getUnlike() {
		
		Scanner sc = new Scanner(System.in) ;
		
		int num , x = 0 ;
//		int z ;
		int[] unlike = new int[43] ;
		String y ;
		while( true ) {
				if( sc.hasNextInt() ) {
						num = sc.nextInt() ;
						if( num > 0 && num < 50 ) unlike[x++] = num ;
						else System.out.println( "請輸入不想要的號碼\n如已完成輸入請輸入\"Y\""
								+ "\n系統將自動為您隨機選取六個號碼") ;
				}else {
					y = sc.next() ; 
					if("y".equalsIgnoreCase(y)) { 
//							z = x ;
							Arrays.sort(unlike);
							sc.close();
							break ;
					}else System.out.println( "請輸入不想要的號碼\n如已完成輸入請輸入\"Y\""
																		+ "\n系統將自動為您隨機選取六個號碼") ;
				}
		} 	return unlike ;
	}

	public int[] getRandomLucky6() {
//		Hw3_3 unlike = new Hw3_3() ;
//		int[] data = unlike.getUnlike() ;
		
		int[] data = getUnlike() ;
		
//		int[] lucky6 = new int[6];
		int[] lucky6 =  { 100 , 100 , 100 , 100 , 100 , 100 } ;
		int i = 0  ;
		
		while( i < 6 ){
				int luckyNum = (int)( Math.random()*49)+1  ;
				if( Arrays.binarySearch( data , luckyNum ) < 0) {
				
						if( Arrays.binarySearch( lucky6 , luckyNum ) < 0 ) { 
								
								lucky6[i++] = luckyNum ;			
								Arrays.sort( lucky6 ) ;
						}
				}
		} 
		
		return lucky6 ;
	}
}
