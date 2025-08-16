package week5;
public class DayInfo {

    // Belirli bir günün çalışma saatini döndürür
    public String getWorkHours(Day day) {
        return day.getWorkHours();
    }

    // Haftanın tüm günlerini ve saatlerini listele
    public void printAllDays() {
        for (Day d : Day.values()) {
            System.out.println(d + ": " + d.getWorkHours());
        }
    }
}
