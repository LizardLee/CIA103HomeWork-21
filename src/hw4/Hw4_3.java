package hw4;

public class Hw4_3 {
	
//	有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)

	public static void main(String[] args) {
		
	String[] planet ={ "mercury" , "venus" , "earth" , "mars" , "jupiter" , "saturn" , "uranus" , "neptune" } ;
	
	String cen = "" ;
	
	for( int i =0 ; i < planet.length ; i++ ) {
		cen += planet[i] ;
	}
	int sum = 0 ;
	char le ;
	
	for( int j =0 ; j <cen.length() ;  j++ ) {
		le = cen.charAt(j) ;
		if( le == 'a' || le == 'e' || le == 'i' || le == 'o' || le == 'u') sum++ ;
//		switch(le){
//				case 'a':
//				case 'e':
//				case 'i':
//				case 'o':
//				case 'u':
//					sum++ ;
//		}
		
	}
	System.out.println(sum) ;
	}
}
