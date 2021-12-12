package chainofresponsability;

import javax.swing.*;

public class ChequeHandler extends AbstractPagamentoHandler {
    public static final int CHEQUE = 3;
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                + " com o cheque?", valor);
        JOptionPane.showMessageDialog(null, "Pago com cheque. Valor restante:"
                + valorRestante);
        return valorRestante;
    }

    @Override
    protected int getTipoPagamento() {
        return CHEQUE;
    }
}
