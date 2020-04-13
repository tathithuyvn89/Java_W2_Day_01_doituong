package Java_W2_Day_01_doituong.Xaydung_lopFan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){

    }
    public  String display (){
        String result;
        if (on){
             result= "Fan of information : {"+" speed: "+ this.speed+ ", color: "+this.color+", radius : "+this.radius+" }"+ " Fan is on";
        } else {
            result= "Fan of information : {"+" color: "+this.color+", radius : "+this.radius+  " }"+" Fan is Off";
        }
        return  result;

    }
}
