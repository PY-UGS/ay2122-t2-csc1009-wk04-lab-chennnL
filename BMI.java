import java.util.Scanner;

/**
 * @author linweichen
 * 26/1/2022
 */

public class BMI {
    private static final double POUNDTOKG = 0.45359237;
    private static final double INCHTOM = 0.0254;
    private double weight;
    private double height;
    private double bmi;

    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        height = scanner.nextDouble();
    }

    public double calculateBMI(double weight, double height) {
        bmi = weight * POUNDTOKG / (height * INCHTOM * height * INCHTOM);
        System.out.println("BMI is " + bmi);
        return bmi;
    }

    public void bmiCategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("Overweight");
        } else if (30 <= bmi) {
            System.out.println("Obese");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
}
