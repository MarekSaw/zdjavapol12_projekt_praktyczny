package Proccesing;

public class Temp {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public void setEve(double eve) {
        this.eve = eve;
    }

    public void setMorn(double morn) {
        this.morn = morn;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "day=" + day +
                ", min=" + min +
                ", max=" + max +
                ", night=" + night +
                ", eve=" + eve +
                ", morn=" + morn +
                '}';
    }
}
