package Java_W2_Day_01_doituong.Xaydunglop_QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
     public  double getDiscriminant(){
        double delta;
        return  delta= Math.pow(b,2)-4*a*c;
     }
     public double getRoot1(){
        double r1;
        return r1= (-this.b + Math.pow(getDiscriminant(),0.5))/(this.a*2);
     }
    public double getRoot2(){
        double r2;
        return r2= (-this.b - Math.pow(getDiscriminant(),0.5))/(this.a*2);
    }

}
