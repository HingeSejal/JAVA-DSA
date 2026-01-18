package com.tca;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDatePgm {
	public static void main(String[] args) {
	   LocalDate ld = LocalDate.now();
	   System.out.println(ld);
	   
	   System.out.println("------------");
	   
	   LocalTime lm = LocalTime.now();
	   System.out.println(lm);
	   
	   System.out.println("------------");
	   
	   LocalDateTime ldm = LocalDateTime.now();
	   System.out.println(ldm);
	   
	   System.out.println("------------");
	   
	   LocalDate anyld = LocalDate.of(2025,11,28);
	   System.out.println(anyld);
	   
	   System.out.println("------------");
	   
	   
	   //Age calculation
	   LocalDate d1 = LocalDate.of(2024, 11, 28);
	   LocalDate d2 = LocalDate.now();
	   Period p = Period.between(d1, d2);
	   System.out.println("Years: "+p.getYears());
	   System.out.println("Months: "+p.getMonths());
	   System.out.println("Days: "+p.getDays());
	   
	   //Duration 
	   LocalTime t1 = LocalTime.of(1, 0);
	   LocalTime t2 = LocalTime.now();
	   Duration d = Duration.between(t1, t2);
	   System.out.println("hrs: "+ d.toHours());
	   System.out.println("min: "+ d.toMinutes());
	   System.out.println("sec: "+ d.toSeconds());
	   
	}
}
