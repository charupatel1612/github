package javaproject;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

//import java.sql.Date;

public class date_time {

	public static void main(String[] args) {
		
		Date date=new Date(System.currentTimeMillis());
		System.out.println("DATE OF SYSTEM IS:" +date);
		 
		Time time=new Time(System.currentTimeMillis());
		System.out.println("TIME OF SYSTEM IS:" +time);
		
		//second way
		LocalDate ldate= LocalDate.now();
		System.out.println("DATE OF SYSTEM IS:" +ldate);
		
		LocalTime ltime=LocalTime.now();
		System.out.println("TIME OF SYSTEM IS:" +ltime);
	}
}
