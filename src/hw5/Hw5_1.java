package hw5;

public class Hw5_1 {
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
 public void starSquare(int width, int height) {
	 
	 for(int i = 0; i < height; i++ ) {
		for(int j = 0; j < width; j++) {
			System.out.print("*");
			if(j == width-1) {
				System.out.println();
			}
		}
	 }
 }
 
}

