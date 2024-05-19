/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execute;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class CurrentDateExample {
    public static void main(String[] args) {
        // Lấy ngày hiện tại
        LocalDate currentDate = LocalDate.now();

        // Lấy thứ trong tuần
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        String dayOfWeekDisplayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

        // Lấy ngày trong tháng
        int dayOfMonth = currentDate.getDayOfMonth();

        // Lấy tháng hiện tại
        int month = currentDate.getMonthValue();
        String monthDisplayName = currentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());

        String year = String.valueOf(currentDate.getYear());
        System.out.println(year);
        // In ra kết quả
        System.out.println("Ngày hiện tại: " + dayOfMonth);
        System.out.println("Tháng hiện tại: " + month + " (" + monthDisplayName + ")");
        System.out.println("Thứ trong tuần: " + dayOfWeekDisplayName);
    }
}

