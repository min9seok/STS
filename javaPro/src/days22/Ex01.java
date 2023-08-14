package days22;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Iterator;

import days21.Student;

public class Ex01 {

	public static void main(String[] args) {
//		  2023/08/11 금요일   07:02:32.259
		  LocalDateTime ldt = LocalDateTime.now();
				String pattern = "\"yyyy.MM.dd E요일 hh:mm:ss.SSS\"";
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
				String d = dtf.format(ldt);
				System.out.println(d);
	}//main
}//class
