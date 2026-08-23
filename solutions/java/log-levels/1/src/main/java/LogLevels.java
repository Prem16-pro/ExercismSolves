public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf(":")+1).trim();
    }

    public static String logLevel(String logLine) {
        int s = logLine.indexOf("[") + 1;
        int e = logLine.indexOf("]");
        return logLine.substring(s,e).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) +")";
    }
}
