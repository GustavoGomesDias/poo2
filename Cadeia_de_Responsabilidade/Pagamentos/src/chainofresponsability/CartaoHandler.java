
package chainofresponsability;

import static chainofresponsability.BoletoHandler.BOLETO;
import java.util.List;
import javax.swing.JOptionPane;


public class CartaoHandler  extends AbstractPagamentoHandler {
    
    public static final int CARTAO =1;  
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Qual o valor para o pagamento"
                + " com cartão?", valor);
        JOptionPane.showMessageDialog(null, "Pago com cartão. Valor restante:" 
                + valorRestante);
        return valorRestante;
    }
    
    @Override
    protected int getTipoPagamento() {
        return CARTAO;
    }

}
