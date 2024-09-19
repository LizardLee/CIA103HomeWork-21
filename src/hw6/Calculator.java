package hw6;

public class Calculator {
	
	
	public Calculator() {
		super();
	}
	
	public Calculator(int x, int y) {
		powerXY(x,y);
	}
	private int xy;
	
	public int powerXY(int x, int y) throws CalException {

		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}
		
		if(y < 0) {
			throw new CalException("次方為負值，回傳結果不為整數");
		}
		
		xy = (int)(Math.pow(x,y));
		return xy;
	}

	public int getXY() {
		return xy;
	}
	
	
}
