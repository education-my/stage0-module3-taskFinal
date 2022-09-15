package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String numberString = number + "";
        System.out.println("" + numberString.charAt(2) + numberString.charAt(1) + numberString.charAt(0));
    }
}
