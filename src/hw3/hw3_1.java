package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3_1 {

//	• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
//
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
		public static void main(String[] args) {
			Hw3_1 allen =new Hw3_1() ;
			double a[] = allen.get3Array();
			allen.triangleType(a[0] , a[1] , a[2]  );
		}	
	
	public  double[]  get3Array(  ) {
			double[] data = new double [3] ;
			Scanner sc = new Scanner (System.in) ;
	
			System.out.println( "請輸入任意三個數字，將會為您判斷是何種類型的三角形邊長~" ) ;
			
			for( int x = 0 ; x < 3 ; x++) {
	
					System.out.println( "請輸入第" + (x+1) + "個數字" ) ;
					
					while( true ) {
							if( sc.hasNextDouble()) {
									data[x]=(sc.nextDouble());
									break;
							}else {sc.next();
								  	System.out.println( "輸入無效，請重新輸入第" + ( x + 1 ) + "個數字" ) ;
							}			  
					}		
		}	sc.close () ;
			Arrays.sort(data);
			return data ;
	}
	
	public  void   triangleType( double a ,double b , double c ) {
		
		System.out.println( a +" " + b + " " + c) ;
		if( a + b <= c ) 	System.out.println( "這三個數無法構成三角形") ;
		
		if( a == b && b == c) System.out.println( "這三個數可以構成正三角形") ;
		else if( a == b || b == c) System.out.println( "這三個數可以構成等腰三角形") ;
		else if(Math.pow(a, 2) + Math.pow(b, 2) ==  Math.pow(c, 2))System.out.println( "這三個數可以構成直角三角形") ;
		else System.out.println( "這三個數可以構成其他三角形") ;
	}
}
