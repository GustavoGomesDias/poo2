package chainfOfResponsability;

public class OneHundredHandler extends AbstractCashMachineHandler{
    private static final int bankNote = 100;

    @Override
    protected int getCashMachineNote() {
        return bankNote;
    }

    @Override
    protected int handlePayment(int value) {
        int numberOfBankNotes = (int) value /bankNote;
        System.out.println(numberOfBankNotes + " notas de 100.");
        return value - (bankNote * numberOfBankNotes);
    }
}
