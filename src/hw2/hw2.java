package hw2;

public class hw2 {

	public static void main( String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

		int  i , sum = 0 ;
		for( i = 1 ; i <= 1000 ; i++) {
			if( i % 2 == 0) {
		 		sum += i ;
			}
		}
		System.out.println(sum);
		
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

	int j ,p = 1 ;
	for( j = 1 ; j <= 10 ; j++) {
		p *= j ;
	}
	System.out.println( p ) ;
	
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

	int jj = 1 , pp = 1 ;
	while(  jj <= 10)	{
				pp *= jj ;
		jj++ ;
	}

	System.out.println( pp ) ;

//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100

	int k = 1 , p1 = 0 ;
	do {
			p1 = k *k;
			System.out.print( p1 + " ") ;
			k++ ;
	} while( k <= 10 ) ;
	System.out.print("\n");
	
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int lu = 1 , count = 0 ;
		while( lu <=49 ) {
				
				if( lu % 10 != 4 && ( lu -( lu % 10 ) ) /10 != 4 ) {
					System.out.print( lu + " " ) ;
					count++ ;
				}lu++ ;
		}System.out.println( "\n" +count);
		
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1

	int  kk = 10 ;
	while( kk >= 1) {
			int ii = 1 ;
			while( ii <= kk ) {
					System.out.print( ii + " " );
					ii++ ;
			}System.out.print( "\n"  );
			kk-- ;
	}
	
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
	
	char ch = 'A' ;
	int n = 1 ;
	while( n <= 6) {
			int m = 1 ;
			while( m <= n ) {
					System.out.print(ch);
					m++ ;
			}n++ ;
			ch++ ;
			System.out.print("\n");
	}
	}
}
