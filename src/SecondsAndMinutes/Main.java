package SecondsAndMinutes;

public class Main {
    public static void main(String[] args) {

    }

    public static String getDurationString(int seconds) {
        int hoursToSeconds = 60;
        int minutesToSeconds = 60;

        int getSeconds = seconds % hoursToSeconds;
        int getMinutes = (seconds - getSeconds) % minutesToSeconds;
//        int getHours = ();
        String durationString = "";

        return durationString;
    }

    public static String getDurationString(int minutes, int seconds) {
        int hoursToSeconds = 60;
        String durationString = "";

        return durationString;
    }
}
