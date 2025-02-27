public class Date {
    public static void main(String[] args) {
        String day, month;
        int date, year;

        day = "Wednesday";
        month = "February";
        date = 19;
        year = 2025;

        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println(day + " " + date + " " + month + ", " + year);
        System.out.println(year + " " + month + " " + date + " " + day);
    }
}