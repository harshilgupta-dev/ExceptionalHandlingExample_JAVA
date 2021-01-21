package Execution;

import Defination.Car;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your car speed here : ");
        Car carObject= new Car(scanner.nextDouble());
        carObject.checkSpeed();

    }

}
