package LoaclDateTime_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.Instant;
public class Localdatetime_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        ldt.getYear();
        ldt.getMonthValue();
        ldt.getDayOfMonth();
        ldt.getHour();
        ldt.getMinute();
        ldt.getSecond();
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ldt.getDayOfWeek().getValue());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String forma = dtf.format(ldt);
        System.out.println("格式化后" + forma);
        //通过静态now(),获取当前时间戳
        Instant now =Instant.now();
        System.out.println(now);
        //通过from可以把Instant对象转换成Date
        Date date = Date.from(now);
        //通过Date的toInstant() 可以把 Date转换成Instant
        Instant instant =date.toInstant();
        
    }
}