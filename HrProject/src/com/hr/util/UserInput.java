package HrProject.src.com.hr.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	private static Scanner sc=new Scanner(System.in);
	public static int inputInt(String st) {		
		
			System.out.print(st+" 정수>");		
			
		return Integer.parseInt(sc.nextLine());		
	}
	public static Integer inputInteger(String st) {		
		
		System.out.print(st+" 정수>");
		String defaultValue=sc.nextLine();
		if(defaultValue.equals("")) {
			return null;
		}
	
	return Integer.parseInt(defaultValue);		
}
	public static double inputDouble(String st) {
		try {
			System.out.print(st+" 실수>");
		}catch(InputMismatchException e) {
			e.printStackTrace(); 
		}
		return Double.parseDouble(sc.nextLine());		
	}
	public static String inputString(String st) {
		try {
		System.out.print(st+" 문자>");
		}catch(InputMismatchException e) {
			e.printStackTrace(); 
		}
		return sc.nextLine();		
	}
	public static LocalDateTime inputLocalDateTime(String str) {
		System.out.print(str+" 시간입력(yyyy-MM-dd HH:mm:ss)>");		
		return LocalDateTime.parse(sc.nextLine(),
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));		
	}
	public static String dateToString(LocalDateTime date) {
		return date.format(DateTimeFormatter.ofPattern(
				"yyyy-MM-dd HH:mm:ss"));		
	}
}