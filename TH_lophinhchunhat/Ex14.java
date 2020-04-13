package Java_W2_Day_01_doituong.TH_lophinhchunhat;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:  ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle\n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPrimeter());
        System.out.println("Area of the Rectangle : "+ rectangle.getArea());
    }
}
