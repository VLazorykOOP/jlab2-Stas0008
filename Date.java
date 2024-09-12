import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// 5. Створити клас Date для роботи з датою у форматі «рік.місяць.день», що
// містить три поля типу byte. Класс повинен включати не менше ніж 3
// конструктори: числами, рядком вигляду «рік.місяць.день» та датою. Задати
// Програмування мовою Java. 5
// операції: обчислення дати через задану кількість днів, віднімання від дати
// заданої кількості днів, визначення високосності року, отримання та присвоєння
// окремих частин (рік, місяць, день), порівняння дат (дорівнює, до, після),
// обчислення кількості днів між датами.


public class Date {

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(LocalDate date) {
        this.year = (int) date.getYear();
        this.month = (int) date.getMonthValue();
        this.day = (int) date.getDayOfMonth();
    }
    public Date(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(dateStr, formatter);
        this.year = (int) date.getYear();
        this.month = (int) date.getMonthValue();
        this.day = (int) date.getDayOfMonth();
    }

    public Date addDays(int days) {
        LocalDate date = LocalDate.of(year, month, day).plusDays(days);
        return new Date(date);
    }
    public Date subtractDays(int days) {
        LocalDate date = LocalDate.of(year, month, day).minusDays(days);
        return new Date(date);
    }
    public boolean isLeapYear() {
        LocalDate date = LocalDate.of(year, month, day);
        return date.isLeapYear();
    }


    public boolean isBefore(Date other) {
        LocalDate thisDate = LocalDate.of(year, month, day);
        LocalDate otherDate = LocalDate.of(other.year, other.month, other.day);
        return thisDate.isBefore(otherDate);
    }
    public boolean isAfter(Date other) {
        LocalDate thisDate = LocalDate.of(year, month, day);
        LocalDate otherDate = LocalDate.of(other.year, other.month, other.day);
        return thisDate.isAfter(otherDate);
    }
    public long daysBetween(Date other) {
        LocalDate thisDate = LocalDate.of(year, month, day);
        LocalDate otherDate = LocalDate.of(other.year, other.month, other.day);
        return ChronoUnit.DAYS.between(thisDate, otherDate);
    }

    @Override
    public String toString() {
        return String.format("%04d.%02d.%02d", year, month, day);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Date)) {
            return false;
        }
        Date other = (Date) obj;
        return this.year == other.year && this.month == other.month && this.day == other.day;
    }

    
}