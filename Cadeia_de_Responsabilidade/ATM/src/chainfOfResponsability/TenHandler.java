package chainfOfResponsability;

public class TenHandler extends AbstractCashMachineHandler {
    private static final int bankNote = 10;

    @Override
    protected int getCashMachineNote() {
        return bankNote;
    }

    @Override
    protected int handlePayment(int value) {
        int numberOfBankNotes = (int) value/bankNote;
        System.out.println(numberOfBankNotes + " notas de 10.");
        return value - (bankNote * numberOfBankNotes);
    }
}
