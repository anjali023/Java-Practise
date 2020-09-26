package Java8;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		Date dt1 = convetUsingInstant(ldt);
		System.out.println(dt1);
		System.out.println("=============================");
		Date dt2 = convertUsingTimeStamp(ldt);
		System.out.println(dt2);
	}

	public static Date convetUsingInstant(LocalDateTime localDateTime) {
		return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
	}
	
	public static Date convertUsingTimeStamp(LocalDateTime localDateTime) {
		return Timestamp.valueOf(localDateTime);
	}
}
