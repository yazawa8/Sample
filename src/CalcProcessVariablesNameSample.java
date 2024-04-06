public class CalcProcessVariablesNameSample {

    public static void main(String[] args) {
        // 1日の秒数 = 24時間 x 60分 x 60秒
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinutes = 60;
        int secondsPerDay = hoursPerDay * minutesPerHour * secondsPerMinutes;

        System.out.println(secondsPerDay);
    }
}