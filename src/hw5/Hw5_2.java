package hw5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw5_2 {
//	 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	
	public void randAvg() {
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() <= 10) {
			set.add((int)(Math.random()*100));
		}
		
		Iterator it = set.iterator();
		Integer avg = 0;
		while(it.hasNext()) {
			Integer rand =(int) it.next();
			System.out.print(rand + " ");
			avg += rand ;
		}
		System.out.println();
		System.out.println(avg/10);
	}
	public static void main(String[] args) {
		Hw5_2 hw5 = new Hw5_2();
		hw5.randAvg();
	}
}
