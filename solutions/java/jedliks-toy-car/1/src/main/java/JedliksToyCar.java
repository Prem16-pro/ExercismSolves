public class JedliksToyCar {
    public int metersDriven = 0;
    public int batteryPercent = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        return batteryPercent > 0 ? "Battery at "+batteryPercent+"%" : "Battery empty";
    }

    public void drive() {
        if(batteryPercent > 0){
            metersDriven += 20;
            batteryPercent -= 1;
        }
    }
}
