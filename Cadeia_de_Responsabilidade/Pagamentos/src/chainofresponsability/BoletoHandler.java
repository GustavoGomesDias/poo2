
package chainofresponsability;

import java.util.List;
import javax.swing.JOptionPane;

public class BoletoHandler  extends AbstractPagamentoHandler {
    public static final int BOLETO =2;
    @Override
    protected int  handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o "
                + "pagamento com Boleto?", valor);
        JOptionPane.showMessageDialog(null, "Boleto gerado. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }

    @Override
    protected int getTipoPagamento() {
        return BOLETO;
    }

    
   
    
}
