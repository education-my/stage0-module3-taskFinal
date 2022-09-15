package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        String numberString = number + "";
        System.out.println(
                Integer.parseInt("" + numberString.charAt(0))
                        + Integer.parseInt("" + numberString.charAt(1))
                        + Integer.parseInt("" + numberString.charAt(2))
                        + Integer.parseInt("" + numberString.charAt(3))
        );
    }
}
