package com.gla.array.level2;
import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Weight: ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Height: ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";

            System.out.println("BMI: " + bmi +
                    " Status: " + weightStatus[i]);
        }
    }
}
