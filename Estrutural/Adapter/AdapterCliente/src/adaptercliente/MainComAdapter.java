
package adaptercliente;

import adaptercliente.clienteExternoAdapter.ClienteExternoAdapter;
import adaptercliente.visao.VisaoCliente;
import lib.ClienteExterno;

public class MainComAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClienteExterno ce = new ClienteExterno();
        ce.setCelular("9997777");
        ce.setDddCelular("027");
        ce.setTelefone("3333");
        ce.setDddTelefone("027");
        ce.setEmail("jose.silva@email.com");
        ce.setNome("Jose");
        ce.setSobreNome("Silva");
        ClienteExternoAdapter cliente = new ClienteExternoAdapter(ce);
        VisaoCliente visao = new VisaoCliente();
        visao.setInformacoesCliente(cliente);//espera um Cliente
        visao.setVisible(true);
        
        
    }
    
}
