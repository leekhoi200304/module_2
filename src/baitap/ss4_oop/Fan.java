package baitap.ss4_oop;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public boolean getOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan(int speed,  double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public String toString() {
        if (getOn()) {

                return "speed: "+this.speed + " ,radius: "+this.radius+ " ,color: "+this.color+ " ,fan is on";

        } else {
            return "color: "+this.color + " ,radius: "+this.radius+ " ,fan is off";
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(SLOW,5.0,"yellow", true);
        Fan fan2 = new Fan(MEDIUM,2.0,"blue", false);

        System.out.println("fan1: "+fan1);
        System.out.println("fan2: "+fan2);



    }
}


