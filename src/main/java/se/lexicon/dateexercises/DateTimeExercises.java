package se.lexicon.dateexercises;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTimeExercises {

    public static void printDateTimeExercises(){

           LocalDate currentDate=LocalDate.now();

           System.out.println("============ex1");
           System.out.println(currentDate);


           System.out.println();
           System.out.println("============ex2");
           DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE dd MMMM",new Locale("sv","SE"));
           String formattedDate = currentDate.format(formatter);
           System.out.println("formattedDate = " + formattedDate);



           System.out.println();
           System.out.println("============ex3");
           LocalDate lastWeekDate = currentDate.minusWeeks(1);
           //System.out.println(lastWeekDate);
           LocalDate lastMonday = lastWeekDate.with( TemporalAdjusters.previous( DayOfWeek.MONDAY ) ) ;
           System.out.println("LastMonday = " + lastMonday);

           LocalDate firstDateOfLastWeek = lastWeekDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
           //System.out.println(firstDateOfLastWeek);

            for ( int i = 0 ; i < 7 ; i++ ) {
                firstDateOfLastWeek.plusDays(i);
                System.out.println("Date = " +  (firstDateOfLastWeek.plusDays(i)).format(DateTimeFormatter.ISO_DATE));
            }


            System.out.println();
            System.out.println("============ex4");

            String date="2024-10-15";
            LocalDate dateObj=LocalDate.parse(date);
            System.out.println("dateObj = " + dateObj);



            System.out.println("============ex5");
            String birthDate="1988-03-25";
            LocalDate birthDateObj=LocalDate.parse(birthDate);
            System.out.println("dateObj = " + birthDateObj.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.US));

            System.out.println();
            System.out.println("============ex6");
            System.out.println(currentDate.plusYears(10).minusMonths(10).getMonth());
            LocalDate futureDate =currentDate.plusYears(10).minusMonths(10);
            System.out.println("futureDate = " + futureDate);
            Month month=futureDate.getMonth();
            System.out.println("month = " + month);


            System.out.println();
            System.out.println("============ex7");
            Period periodBetween = Period.between(birthDateObj, futureDate);
            System.out.println("Days: "+periodBetween.getDays()+" Months: "+periodBetween.getMonths()+" Years: "+periodBetween.getYears());


            System.out.println();
            System.out.println("============ex8");
            Period period=Period.of(4,7,29);
            System.out.println("period.addTo(currentDate) = " + period.addTo(currentDate));


            System.out.println();
            System.out.println("============ex9");
            LocalTime currentTime = LocalTime.now();
            System.out.println("currentTime = " + currentTime);



            System.out.println();
            System.out.println("============ex10");
            System.out.println("Nanoseconds = " + currentTime.getNano());



            System.out.println();
            System.out.println("============ex11");
            String time = "13:15";
            LocalTime time1 = LocalTime.parse(time);
            System.out.println(time1);


            System.out.println();
            System.out.println("============ex12");
            System.out.println(currentTime.format(DateTimeFormatter.ISO_TIME));


            System.out.println();
            System.out.println("============ex13");
            LocalDateTime localDateTimeObj = LocalDateTime.of(
                    2018, 04, 05, 10, 00);
            System.out.println(localDateTimeObj);


            System.out.println();
            System.out.println("============ex14");
            DateTimeFormatter format1=DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm",new Locale("sv","SE"));
            String dateTimeFormat=localDateTimeObj.format(format1);
            System.out.println(dateTimeFormat);


            System.out.println();
            System.out.println("============ex15");
            LocalDateTime ldt=LocalDateTime.of(currentDate,currentTime);
            System.out.println(ldt);


            System.out.println();
            System.out.println("============ex16");
            LocalDateTime localDateTimeObject=LocalDateTime.now();
            //System.out.println("localDateTimeObject = " + localDateTimeObject);
            LocalDate localDate=localDateTimeObject.toLocalDate();
            LocalTime localTime=localDateTimeObject.toLocalTime();
            System.out.println("LocalDate: "+ localDate);
            System.out.println("LocalTime: "+localTime);

        }
}
