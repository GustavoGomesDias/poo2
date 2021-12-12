package chainfOfResponsability;

public class TwoHandler extends AbstractCashMachineHandler {
    private static final int bankNote = 2;

    @Override
    protected int getCashMachineNote() {
        return bankNote;
    }

    @Override
    protected int handlePayment(int value) {
        int numberOfBankNotes = (int) value/bankNote;
        System.out.println(numberOfBankNotes + " notas de 2.");
        return value - (bankNote * numberOfBankNotes);
    }
}
