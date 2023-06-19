public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println("Hawkeye takes off in the sky.");
    }

    @Override
    public void ascend(int altitude) {
        this.altitude += altitude;
        System.out.println("Hawkeye flies upward, altitude: " + this.altitude);
    }

    @Override
    public void descend(int altitude) {
        if (this.altitude - altitude > 0) {
            this.altitude -= altitude;
            System.out.println("Hawkeye flies downward, altitude: " + this.altitude);
        } else {
            System.out.println("Hawkeye is too high, it can't land.");
        }
    }

    @Override
    public void glide() {
        System.out.println("Hawkeye glides into the air.");
    }

    @Override
    public void land() {
        if (altitude > 0) {
            System.out.println("Hawkeye lands on the ground.");
        } else {
            System.out.println("Hawkeye is already on the ground.");
        }
    }
}
