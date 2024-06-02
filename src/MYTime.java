public class MYTime {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour1, int minute1, int second1) {
        if (hour1 <= 23 && hour1 >= 0 && minute1 <= 59 && minute1 >= 0 && second1 <= 59 && second1 >= 0) {
            this.hour = hour1;
            this.minute = minute1;
            this.second = second1;
        } else {
            System.out.println("yaroqsiz vaqt kitildi!");
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void nextSecond() {
        if (this.second < 59) {
            this.second++;
            System.out.printf("%02d:%02d:%02d%n", hour, minute, second);

        } else {
            if (this.minute < 59) {
                this.second = 0;
                this.minute++;
                System.out.printf("%02d:%02d:%02d", hour, minute, second);
            } else {
                if (this.hour < 23) {
                    this.second = 0;
                    this.minute = 0;
                    this.hour++;
                    System.out.printf("%02d:%02d:%02d", hour, minute, second);
                } else {
                    this.second = 0;
                    this.minute = 0;
                    this.hour = 0;
                    System.out.printf("%02d:%02d:%02d", hour, minute, second);
                }
            }
        }

    }

    public void nextMinute() {
        if (this.minute < 59) {
            this.minute++;
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
        } else {
            if (this.hour < 23) {
                this.minute = 0;
                this.hour++;
                System.out.printf("%02d:%02d:%02d", hour, minute, second);
            } else {
                this.minute = 0;
                this.hour = 0;
                System.out.printf("%02d:%02d:%02d", hour, minute, second);
            }
        }

    }

    public void nextHour() {
        if (this.hour < 23) {
            this.hour++;
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
        } else {
            this.hour = 0;
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
        }
    }
    public void previoushour() {
        if (this.hour <= 23&&this.hour >0) {
            this.hour--;
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
        }else {
            if (this.hour == 0) {
                this.hour = 23;
                System.out.printf("%02d:%02d:%02d", hour, minute, second);
            }

        }
    }
    public void previoushminute() {
        if (this.minute <= 59&&this.minute >0) {
            this.minute--;
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
        }
        else {
            if (this.minute == 0) {
                this.minute = 59;
                System.out.printf("%02d:%02d:%02d", hour, minute, second);
            }
        }
    }
    public void previoushsecond() {

        if (this.second <= 59&&this.second >0) {
            this.second--;
            System.out.printf("%02d:%02d:%02d", hour, minute, second);
        }
        else {
            if (this.second == 0) {
                this.second = 59;
                System.out.printf("%02d:%02d:%02d", hour, minute, second);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
