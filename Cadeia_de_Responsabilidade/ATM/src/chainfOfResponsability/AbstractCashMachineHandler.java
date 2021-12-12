package chainfOfResponsability;

public abstract class AbstractCashMachineHandler implements CashMachineHandler{
    private CashMachineHandler nextATM;

    @Override
    public void setNextHandler(CashMachineHandler atm) {
        this.nextATM = atm;
    }

    @Override
    public void processHandler(int value) {
        if (value >= getCashMachineNote()) {
            value = handlePayment(value);
        }

        if (this.nextATM != null && value != 0) this.nextATM.processHandler(value);
    }

    protected abstract int getCashMachineNote();
    protected abstract int handlePayment(int value);
}
