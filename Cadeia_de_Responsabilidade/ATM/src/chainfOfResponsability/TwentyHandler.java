package chainfOfResponsability;

public class TwentyHandler extends AbstractCashMachineHandler {
    private static final int bankNote = 20;

    @Override
    protected int getCashMachineNote() {
        return bankNote;
    }

    @Override
    protected int handlePayment(int value) {
        int numberOfBankNotes = (int) value/bankNote;
        System.out.println(numberOfBankNotes + " notas de 20.");
        return value - (bankNote * numberOfBankNotes);
    }
}
