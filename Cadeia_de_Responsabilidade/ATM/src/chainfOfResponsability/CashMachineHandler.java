package chainfOfResponsability;

public interface CashMachineHandler {
    public void setNextHandler(CashMachineHandler atm);
    public void processHandler(int value);
}
