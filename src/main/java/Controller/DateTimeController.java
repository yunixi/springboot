package Controller;

import date.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateTimeController {

    @Autowired
    DateTimeService dateTimeService;

    @GetMapping(value = "todayDate")
    public void todayDate() {
        dateTimeService.todayDate();
    }
}
