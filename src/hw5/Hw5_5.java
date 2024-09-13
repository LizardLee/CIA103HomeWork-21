package hw5;

public class Hw5_5 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static void getAuthCode() {
		char A = 'A', a = 'a', num = '0';
		char[] ran = new char[62];
		char r;
		int index;
		for(int i = 0; i < 10; i++) {
			ran[i]=num;
			num++;
		}
		for(int i = 10; i < 36; i++) {
			ran[i]=A;
			A++;
		}
		for(int i = 36; i < 62; i++) {
			ran[i]=a;
			a++;
		}
		for(int i = 0; i < 8; i++ ) {
			index =(int)( Math.random()*62);
			r = ran[index];
			System.out.print(r);
		}
	}
	public static void main(String[] args) {
		getAuthCode();
	}
}
