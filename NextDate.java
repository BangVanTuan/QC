public class NextDate {
    public static String nextDate(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            return "Invalid date input";
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check for leap year
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29;
        }

        if (day < daysInMonth[month - 1]) {
            return String.format("%d-%d-%d", day + 1, month, year);
        } else if (month < 12) {
            return String.format("1-%d-%d", month + 1, year);
        } else {
            return String.format("1-1-%d", year + 1);
        }
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }
}
