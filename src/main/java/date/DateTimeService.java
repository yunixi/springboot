package date;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Slf4j
public class DateTimeService {

    public void todayDate() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        LocalDateTime localDateTime = LocalDateTime.now();

        log.info("Date : " + date);
        log.info("Calendar : " + calendar);
        log.info("LocalDateTime : " + localDateTime);
    }
}
