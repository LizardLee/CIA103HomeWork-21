package hw4;

import java.util.Arrays;

public class Hw4_6 {

	//	班上有8位同學,他們進行了6次考試結果如下:

//	{ 10 , 35 , 40 , 100 , 90 ,85 , 75 , 70 }
//	{ 37 , 75 , 77 , 89 , 64 , 75 , 70 , 95 }
//	{ 100 , 70 , 79 , 90 , 75 , 70 , 79 , 90 }
//	{ 77 , 95 , 70 , 89 , 60 , 75 , 85 , 89 }
//	{ 98 , 70 , 89 , 90 , 75 , 90 , 89 , 90}
//	{  90 , 80 , 100 , 75 , 50 , 20 , 99 , 75 }
	
//	請算出每位同學考最高分的次數
//	(提示:二維陣列)
	
		public static void main(String[] args) {
//			System.out.println("Running");
				int[] bestScoreCount = {0,0,0,0,0,0,0,0};
				int[][] testScore = {
				{ 10 , 35 , 40 , 100 , 90 ,85 , 75 , 70 } ,
				{ 37 , 75 , 77 , 89 , 64 , 75 , 70 , 95 } ,
				{ 100 , 70 , 79 , 90 , 75 , 70 , 79 , 90 } ,
				{ 77 , 95 , 70 , 89 , 60 , 75 , 85 , 89 } ,
				{  98 , 70 , 89 , 90 , 75 , 90 , 89 , 90} ,
				{  90 , 80 , 100 , 75 , 50 , 20 , 99 , 75 }
				} ;
		
				for( int i = 0 ; i < testScore.length ; i++) {
						int ts1[] = Arrays.copyOf(testScore[i] , testScore[i].length ) ;
						Arrays.sort(ts1);
						int bestScore = ts1[ts1.length-1];
								for( int j = 0 ; j < ts1.length ; j++) {
				
										if(testScore[i][j] == bestScore) {
											bestScoreCount[j]++;
												break;
										}
								}
				}
				for(int i = 0 ; i <  testScore[0].length ; i++ ) {
					int j =i+1;
					System.out.println( "第"+ (j)+"位同學" + bestScoreCount[i] +"次");
					
				}
		}
}
