
package chainofresponsability;

import java.util.List;
import javax.swing.JOptionPane;


public abstract class AbstractPagamentoHandler implements PagamentoHandler {
    private PagamentoHandler nextPagamentoHandler;
    @Override
    public void setNextHandler(PagamentoHandler handler) {
        this.nextPagamentoHandler = handler;
    }
    public void processHander(List lista, int valor) {                
        if(lista.contains(getTipoPagamento()))
              valor = handlePagamento(valor);                               
        if (nextPagamentoHandler != null && valor >0)
            this.nextPagamentoHandler.processHander(lista, valor);
        
    }
    protected abstract int getTipoPagamento();
    protected int perguntaPagamento(String mensagem, int valor){
        String valorPagamento = JOptionPane.showInputDialog(mensagem);
        int valorRestante = 0;
        if(!valorPagamento.equalsIgnoreCase("")){
            valorRestante = valor - Integer.parseInt(valorPagamento);        
        }
        return valorRestante;
    }    
    
    protected abstract int handlePagamento(int valor);
}

