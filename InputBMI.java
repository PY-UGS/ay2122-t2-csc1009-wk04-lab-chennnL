/**
 * @author linweichen
 * 26/1/2022
 */


public class InputBMI extends BMI {
    public  static void main(String[] args){
        BMI andy = new BMI();
        andy.userInput();
//        andy.calculateBMI();
        andy.bmiCategory(andy.calculateBMI(andy.getWeight(),andy.getHeight()));
    }
}
