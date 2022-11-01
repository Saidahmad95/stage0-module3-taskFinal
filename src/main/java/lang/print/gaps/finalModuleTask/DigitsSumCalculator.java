package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {// 8369
        System.out.println(number%10+(number%100)/10+(number/100)%10+number/1000);
    }
}
