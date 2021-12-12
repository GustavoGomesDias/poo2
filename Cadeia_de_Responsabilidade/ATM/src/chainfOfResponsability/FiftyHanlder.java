package chainfOfResponsability;

public class FiftyHanlder extends AbstractCashMachineHandler{
    private static final int bankNote = 50;

    @Override
    protected int getCashMachineNote() {
        return bankNote;
    }

    @Override
    protected int handlePayment(int value) {
        int numberOfBankNotes = (int) value/bankNote;
        System.out.println(numberOfBankNotes + " notas de 50.");
        return value - (bankNote * numberOfBankNotes);
    }
}
