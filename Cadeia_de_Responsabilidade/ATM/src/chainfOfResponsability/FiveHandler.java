package chainfOfResponsability;

public class FiveHandler extends AbstractCashMachineHandler {
    private static final int bankNote = 5;

    @Override
    protected int getCashMachineNote() {
        return bankNote;
    }

    @Override
    protected int handlePayment(int value) {
        int numberOfBankNotes = (int) value/bankNote;
        System.out.println(numberOfBankNotes + " notas de 5.");
        return value - (bankNote * numberOfBankNotes);
    }
}
