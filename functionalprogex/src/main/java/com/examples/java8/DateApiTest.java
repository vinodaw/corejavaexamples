package com.examples.java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateApiTest {

	public static void main(String[] args) {
		
		//Clock
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		
		System.out.println(millis);
		
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);
		System.out.println("date: "+legacyDate);
		
		//TimeZones
		//System.out.println(ZoneId.getAvailableZoneIds());
		ZoneId.getAvailableZoneIds().stream().filter(s->s.startsWith("Asia")).forEach(System.out::println);
		
		ZoneId zone1 = ZoneId.of("Asia/Bangkok");
		ZoneId zone2 = ZoneId.of("Asia/Calcutta");
		System.out.println(zone1.getRules());
		
		//LocalTime
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(zone2);
		
		System.out.println(now1);
		System.out.println(now2);
		
		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

		System.out.println(hoursBetween);       
		System.out.println(minutesBetween);     

	}

}
