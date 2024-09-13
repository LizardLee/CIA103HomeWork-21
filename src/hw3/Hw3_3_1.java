package hw3;


import java.util.Arrays;
import java.util.Scanner;

public class Hw3_3_1 {

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//
//	(提示:Scanner)
//	(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	
	public static void main(String[] args) {
		System.out.println("請輸入你不喜歡的數字，系統會幫你排除後隨機取六個數字給你");
		Scanner sc = new Scanner(System.in);
		
		int u ;
		
		while(true)
				if(sc.hasNextInt()) {
						u =  sc.nextInt() ;
						if(u > 0 && u < 10) {
								break;
						}
				}
		
		int[] unlike = new int[ 50 ] ;
		
		for( int i = 1 ; i < 50 ; i++ ) {
				if( i%10 != u && i/10 !=u) {
						unlike[i] = i ;
//						System.out.print(unlike[i] + " ") ;
				}
		}
		sc.close();
		int lucky , k = 0 ;
		int[] luckyNum = new int[6] ; 
		
		while( k < 6 ) {	
				lucky = ( int )(Math.random()*49) + 1 ;					
						if( unlike[lucky] != 0 ) {						
								luckyNum[k] =  unlike[lucky]  ;
								unlike[lucky] = 0 ;
								k++ ;
						}
				}
		Arrays.sort(luckyNum) ;
		
		for( int j = 0 ; j < 6 ; j++)
		System.out.print(luckyNum[j] + " ") ;
		}
	}

