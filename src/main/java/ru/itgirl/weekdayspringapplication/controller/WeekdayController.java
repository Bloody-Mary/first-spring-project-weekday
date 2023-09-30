package ru.itgirl.weekdayspringapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weekday")
public class WeekdayController {
    private enum Weekday {
       MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THUESDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

       private final String russianName;
       WeekDay(String russianName) {
           this.russianName = russianName;
       }

       public String getRussianName() {
           return russianName;
       }
    }
}
