
package chainofresponsability;

import java.util.List;


public interface PagamentoHandler {    
    public void setNextHandler(PagamentoHandler handler);
    public void processHander(List lista, int valor);    
}
