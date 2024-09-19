package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("請輸入x值");
			int x= sc.nextInt();
			System.out.println("請輸入y值");
			int y= sc.nextInt();
			
//			Calculator cal = new Calculator();
//			int xy= cal.powerXY(x,y);
			Calculator cal = new Calculator(x,y);
			int xy= cal.getXY();
			System.out.println("x的y平方為"+ xy);
		}catch (CalException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
