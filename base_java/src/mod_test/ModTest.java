package mod_test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Iterator;

public class ModTest {
	public static void main(String[] args) {
		/*int num1 = 36;
		int num2 = 48;
		int res = 0;
		// 1 2 3 4 5
		while(res != 0) {
		*/
		LocalDate current_date = LocalDate.now();
	    System.out.println("Current date: " + current_date);
	    int current_Year = current_date.getYear();
	    
	    for(int i=0; i<=current_Year; i++){
	    	if((i%4 == 0 && i%100 != 0) || i%400 == 0) { 
	    		System.out.println(i+" 윤년!");	    		
	    	}else {
				System.out.println("-");
			}
		}
		
	}
}
