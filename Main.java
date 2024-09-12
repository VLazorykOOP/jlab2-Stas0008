public class Main {
    
    public static void main(String[] args) {

        Date first = new Date("2024.09.11");
        Date second = new Date("2077.08.20");
        
        Date plus = first.addDays(666);
        System.out.println("Date before: " + first + "| Date after: "  + plus);

        Date minus = second.subtractDays(10500);
        System.out.println("Date before: " + second + " | Date after: " + minus);

        if(first.isLeapYear()) System.out.println("This year are leap: " + first);
        else System.out.println("This year is not leap: " + first);

        if(first.isBefore(second)) System.out.println("First date is before: " + first);
        else System.out.println("Second date is before: " + second);

        if(first.isAfter(second)) System.out.println("First date is after: " + first);
        else System.out.println("Second date is after: " + second);

        System.out.println("Days between: " + first.daysBetween(second));

        if(first.equals(second)) System.out.println("This years are equals.");
        else System.out.println("This years is not equals.");

        if(first.equals(first)) System.out.println("This years are equals.");
        else System.out.println("This years is not equals.");
    }
}
