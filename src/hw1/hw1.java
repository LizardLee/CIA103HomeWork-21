package hw1;

public class Hw1 {
	
	public static void main(String[] args) {
		
//		1. 請設計一隻Java程式,計算12,6這兩個數值的和與積
		
		System.out.println ( "第一題" ) ;

		int num1 = 12 , num2 =6;
		String w1 =  " 12 和 6 的" ;
		System.out.println ( w1 + "的和為" + ( num1 + num2 ) ) ;
		System.out.println ( w1  + "的積為" +num1 * num2 ) ;
		
//		2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		
		System.out.println ( "第二題" ) ;
		
		int dozen = 200/12 , egg = 200-(12*dozen);
		System.out.println("兩百顆蛋一共是"+dozen+"打"+egg+"顆");
		
//		3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		System.out.println ( "第三題" ) ;
		
		int s3 =256559;   
		int mins = s3 / 60 , secs = s3 - ( mins * 60) , hrs = mins / 60 , days = hrs / 24 ;
		
		mins = mins - ( hrs *60 ) ;	
		hrs = hrs - ( days * 24 ) ;
			
		System.out.println( s3 + " 秒為 " + days + " 天 " + hrs + " 小時 " + mins + " 分鐘 " + secs + " 秒 " ) ;

		int t = 1;
		int [] time = new int [ 5 ] ;
		
		time[ 0 ] = s3 ;
		
		do{	
				if( t < 4 ) {
					time[t]=s3 % 60 ;
					s3 -= (s3 % 60 ) ;
					s3 /=60 ;
				}else {time[ t ] = s3 / 24 ;}
				t++ ;
		}while( t <= 4 ) ;
		
		System.out.println(  time[ 0 ] + " 秒為 " +  time[ --t ] + " 天 " +  time[-- t ] + " 小時 " +  time[-- t ] + " 分鐘 " +   time[ --t ] + " 秒 " ) ;
//		while(t>=0) {
		
		
//		4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		
		System.out.println ( "第四題" ) ;
		
		final double pi = 3.1415 ;
		int radius = 5 ;
		double area = pi * ( Math.pow ( radius , 2 ) ) ,  perimeter = pi * radius  * 2 ;
		String w2 = " 半徑為5的圓的圓" ;
		
		System.out.println ( w2 + "面積為" + area ) ;
		System.out.println ( w2 + "周長為" + perimeter );  //這一列的結果不知道為什麼怪怪的
		
//		5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		     金加利息共有多少錢 (用複利計算,公式請自行google)
		
		System.out.println ( "第五題" ) ;
		// FV = PV *( 1 + r ) n次方
		
		int fv; 
		//期末本利
		int pv =1_500_000;
		//初期本金
		double r = 0.02 , r1 = 1 + r ;
		//年利率,本利和
		
		fv =(int) (pv * ( Math.pow(r1 , 10 ) ) ) ;
		System.out.println ( fv + "元") ;
		
//		6. 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5”
//			並請用註解各別說明答案的產生原因

		System.out.println ( "第六題" ) ;
		
		System.out.println ( 5 + 5 );
		/*未經標註的整數在運算中會被java莫認為int，
		 * 所以這邊的兩個5會如正常運算般獲得10這個答案*/
		System.out.println ( 5 + '5' );
		/*單引號標註的視為char(字元)，所以此次運算為int+char兩種類別的運算，
		 * 回傳值會默認調整至較高型別，而char型別中的字元'5'在Unicode中對應為53，
		 * 5+53=58，故顯示為58 */
		System.out.println ( 5 + "5" );
		/*雙引號標註的視為String(字串)，字串型別高於基礎型別，
		 * 又回傳值會默認調整至較高型別，故(5+"5")視為串接兩個"5"，
		 * 方得"55"		 */
		
	}

}
