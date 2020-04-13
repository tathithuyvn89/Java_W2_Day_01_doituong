package Java_W2_Day_01_doituong.Xaydung_lopFan;

public class Test_Fan {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.display());
        Fan fan2= new Fan();
        System.out.println(fan2.display());
    }
}
