package day1.src.Level3_28;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        System.out.printf("BMI = %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Status: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}

