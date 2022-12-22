package java_35e_HW.HW_24_DataTime;

public class CustomDateTime implements Comparable {
    private int dayOfMonth;
    private final Month month;
    private final int year;
    private int hour;
    private int minute;
    private int second;

    public CustomDateTime(long unixTimestamp) {
        if (unixTimestamp < 0) {
            throw new RuntimeException("Only positive timestamps supported");
        }
        year = yearCalculate(unixTimestamp);
        month = monthCalculate();
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public boolean isBefore(CustomDateTime d) {
        if (this.compareTo(d) < 0) return true;
        else return false;
    }

    public boolean isAfter(CustomDateTime d) {
        if (this.compareTo(d) >= 0) return false;
        else return true;
    }

    @Override
    public int compareTo(Object o) {
        CustomDateTime date = (CustomDateTime) o;
        if (this.year != date.getYear()) return this.year - date.getYear();
        if (this.month.numberOfMonth != date.getMonth().numberOfMonth)
            return this.getMonth().numberOfMonth - date.getMonth().numberOfMonth;
        if (this.dayOfMonth != date.getDayOfMonth()) return this.getDayOfMonth() - date.getDayOfMonth();
        if (this.hour != date.getHour()) return this.hour - date.getHour();
        if (this.minute != date.getMinute()) return this.minute - date.getMinute();
        if (this.second != date.getSecond()) return (int) (this.second - date.getSecond());
        else return 0;
    }

    public static enum Month {
        JANUARY (1),
        FEBRUARY (2),
        MARCH (3),
        APRIL (4),
        MAY (5),
        JUNE (6),
        JULY (7),
        AUGUST (8),
        SEPTEMBER (9),
        OCTOBER (10),
        NOVEMBER (11),
        DECEMBER (12);

        private int numberOfMonth;

        public int getNumberOfMonth() {
            return numberOfMonth;
        }

        Month(int i) {
            this.numberOfMonth = i;
        }
    }

    private int yearCalculate(long time) {//Расчет текущего года
        int yearCurrent = 1970;//Начало отсчета
        int secondPerYear = 365 * 86_400; //количество секунд в году не високосном
        while (time >= secondPerYear) {
            //отнимаем количество секунд за каждый год с учетом високосный год или нет
            time = time - (isYearLeap(yearCurrent) ? 366 : 365) * 86_400;
            if (isYearLeap(yearCurrent)) secondPerYear = 366 * 86_400; //количество секунд в году в високосном
            else secondPerYear = 365 * 86_400; //количество секунд в году не високосном
//            System.out.println("yearCurrent = " + yearCurrent);
//            System.out.println("isYearLeap = " + isYearLeap(yearCurrent)
//                    + ", days = " + (isYearLeap(yearCurrent) ? 366 : 365));
//            System.out.println("time(current) = " + time);
//            System.out.println();
            yearCurrent++; //добавляем год
        }
        this.second = (int) time;
        return yearCurrent;
    }

    private boolean isYearLeap(int year) {//Является ли год високосным
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        } else
            leap = false;
        return leap;
    }

    private Month monthCalculate() {//Расчет текущего месяца
        Month month;
        int days = (int) (this.second / 86_400) + 1;
        System.out.println("days = " + days);
        int leap = 0;
        if (isYearLeap(this.year)) leap = 1;//If year is leaped
        if (days <= 31) month = Month.JANUARY;
        else if (days > 31
                && days <= 31 + 28 + leap) {
            month = Month.FEBRUARY;
            this.dayOfMonth = days - 31;
        } else if (days > 31 + 28 + leap
                && days <= 31 + 28 + leap + 31) {
            month = Month.MARCH;
            this.dayOfMonth = days - (31 + 28 + leap);
        } else if (days > 31 + 28 + leap + 31
                && days <= 31 + 28 + leap + 31 + 30) {
            month = Month.APRIL;
            this.dayOfMonth = days - (31 + 28 + leap + 31);
        } else if (days > 31 + 28 + leap + 31 + 30
                && days <= 31 + 28 + leap + 31 + 30 + 31) {
            month = Month.MAY;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30);
        } else if (days > 31 + 28 + leap + 31 + 30 + 31
                && days <= 31 + 28 + leap + 31 + 30 + 31 + 30) {
            month = Month.JUNE;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31);
        } else if (days > 31 + 28 + leap + 31 + 30 + 31 + 30
                && days <= 31 + 28 + leap + 31 + 30 + 31 + 30 + 31) {
            month = Month.JULY;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31 + 30);
        } else if (days > 31 + 28 + leap + 31 + 30 + 31 + 30 + 31
                && days <= 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31) {
            month = Month.AUGUST;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31 + 30 + 31);
        } else if (days > 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31
                && days <= 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30) {
            month = Month.SEPTEMBER;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31);
        } else if (days > 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30
                && days <= 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) {
            month = Month.OCTOBER;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30);
        } else if (days > 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
                && days <= 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) {
            month = Month.NOVEMBER;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31);
        } else {
            month = Month.DECEMBER;
            this.dayOfMonth = days - (31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30);
        }
        //После расчета месяца считаем остаток секунд
        this.second = (int) (this.second % 86_400);

        //Рассчитываем количество часов
        this.hour = this.second / 3_600;
        //После расчета часов снова считаем остаток секунд
        this.second = (int) (this.second % 3_600);

        //Рассчитываем количество минут
        this.minute = this.second / 60;
        //После расчета минут снова считаем остаток секунд (final)
        this.second = (int) (this.second % 60);

        return month;//возвращаем текущий месяц
    }

    @Override
    public String toString() {//example "2022-12-20T22-49-53";
        return getYear() + "-" + getMonth().getNumberOfMonth() + "-" + getDayOfMonth() + "T" +
                getHour() + "-" + getMinute() + "-" +getSecond();
    }

}
