package java8.datatime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterCode {
    public static void main(String[] args) {

        DateTimeFormatterCode dateTimeFormatterCode =new DateTimeFormatterCode();
        String formatterDateString= dateTimeFormatterCode.getFormatterString("01/05/2018 15:29:19","MM/dd/yyyy HH:mm:ss" ,"dd-MM-yyyy");
        System.out.println(formatterDateString);
    }

    private String getFormatterString(String dateString, String dateStringPrePattern, String dateStringPostPattern){
        return LocalDate.parse(dateString,DateTimeFormatter.ofPattern(dateStringPrePattern)).format(DateTimeFormatter.ofPattern(dateStringPostPattern));
    }
}
