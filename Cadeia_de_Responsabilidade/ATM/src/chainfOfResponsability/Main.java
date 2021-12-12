package chainfOfResponsability;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CashMachineHandler oneHundred = new OneHundredHandler();
        CashMachineHandler fifty = new FiftyHanlder();
        CashMachineHandler twenty = new TwentyHandler();
        CashMachineHandler ten = new TenHandler();
        CashMachineHandler five = new FiveHandler();
        CashMachineHandler two = new TwoHandler();

        oneHundred.setNextHandler(fifty);
        fifty.setNextHandler(twenty);
        twenty.setNextHandler(ten);
        ten.setNextHandler(five);
        five.setNextHandler(two);
        System.out.println("Qual o valor que irá retirar?");
        int value = read.nextInt();
        oneHundred.processHandler(value);
    }
}
