package Java_W2_Day_01_doituong.Xaydunglop_QuadraticEquation;

import java.util.Scanner;

public class Test_quadraticEquation {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        System.out.print("Enter number a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter numbe b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter number c : ");
        double c = scanner.nextDouble();
         QuadraticEquation quadratic= new QuadraticEquation(a,b,c);
         if (quadratic.getDiscriminant()>0){
             System.out.println("The equatation have two roots "+ "root 1 is "+ quadratic.getRoot1()+ " root 2 is "+ quadratic.getRoot2());
         } else if(quadratic.getDiscriminant()==0){
             System.out.println("The equatation have one root "+ "root 1 is "+ quadratic.getRoot1());
         } else {
             System.out.println("The equation has no real roots");
         }

    }
}
