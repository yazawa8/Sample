package  javaapis.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateSample02 {

    public static void main(String[] args) {
        // 現在日時の取得と表示
        LocalDateTime dateTime = LocalDateTime.now();

        // 日付のフォーマット
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String str = dateTime.format(formatter);
        System.out.println(str);
    }
}