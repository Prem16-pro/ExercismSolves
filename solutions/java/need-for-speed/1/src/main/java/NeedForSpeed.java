class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            battery -= batteryDrain;
            distanceDriven += speed;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50,4);
        return car;
    }
    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        // Calculate the maximum distance the car can travel before its battery drains
        int maxDistance = (100 / car.getBatteryDrain()) * car.getSpeed();
        return maxDistance >= distance;
    }
}

