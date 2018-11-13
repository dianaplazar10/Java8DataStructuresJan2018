package com.other;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ParseTimestamp {

    public static void main(String[] args) {
//        Timestamp startDate = Timestamp.from(Instant.parse(request.get("startDate").toString()));
//        Timestamp endDate = Timestamp.from(Instant.parse(request.get("endDate").toString()));

//        String dateTime = "2012-02-22T02:06:58.147Z";
//        ZonedDateTime d = ZonedDateTime.parse(dateTime);
        
//      String dateTime = "2018-08-18";
//      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");//yyyy-MM-dd'T'hh:mm:ss.SX");
//
//
//      ZonedDateTime d = ZonedDateTime.parse(dateTime, formatter);
//      
////      ZonedDateTime d = str2ZonedDtTime(dateTime);
////      ZonedDateTime d = ZonedDateTime.parse(dateTime);
//      Timestamp timestamp = toTimestamp(d);
//      System.out.println(timestamp);
//     
//      Timestamp.valueOf(d);
        
//        Timestamp startDate = Timestamp.valueOf("2018-08-18");
//        Timestamp endDate = Timestamp.from(Instant.parse("2018-08-18"));
//        System.out.println(startDate);
//        System.out.println(endDate);
        
        
        Timestamp timestamp = getTimestampfromStringDate("2018-08-18");
        System.out.println(timestamp);
    }
    
    public static Timestamp toTimestamp(ZonedDateTime dateTime) {
        return new Timestamp(dateTime.toInstant().getEpochSecond() * 1000L);
      }
    
    public static ZonedDateTime str2ZonedDtTime(String dateTime){
//        final String dateTime = "2012-02-22T02:06:58.147Z";
            DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
            final ZonedDateTime parsed = ZonedDateTime.parse(dateTime, formatter.withZone(ZoneId.of("UTC")));
            System.out.println(parsed.toLocalDateTime());
        return parsed;
    }
    
    public static Timestamp getTimestampfromStringDate(String sinceDate){ 
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");//MM/dd/yyyy");
        Date date = null;
        try {
            if(sinceDate.isEmpty() || sinceDate.equalsIgnoreCase(""))
                return null;
            date = formatter.parse(sinceDate);
        } catch (ParseException e) {
//            log.error(e);
        }
        return (date == null ? null : new java.sql.Timestamp(date.getTime())); 
    }

}
