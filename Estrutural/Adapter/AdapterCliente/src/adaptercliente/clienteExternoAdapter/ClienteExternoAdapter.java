package adaptercliente.clienteExternoAdapter;

import adaptercliente.model.ICliente;
import lib.ClienteExterno;

public class ClienteExternoAdapter implements ICliente {
    private ClienteExterno cliente;

    public ClienteExternoAdapter(ClienteExterno cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getNomeCompleto() {
        return this.cliente.getNome() + " " + this.cliente.getSobreNome();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        String[] arrNomeCompleto = nomeCompleto.split(" ");
        this.cliente.setNome(arrNomeCompleto[0]);
        String sobrenome = arrNomeCompleto[1];
        if (arrNomeCompleto.length > 2) {
            String[] arrSobreNome = new String[arrNomeCompleto.length - 2];
            System.arraycopy(arrNomeCompleto, 2, arrSobreNome, 0, arrNomeCompleto.length - 2);
            for (String s : arrSobreNome) sobrenome += " " + s;
        }

        this.cliente.setSobreNome(sobrenome);
    }

    @Override
    public String getTelefone() {
        return this.cliente.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        this.cliente.setTelefone(telefone);
    }

    @Override
    public String getEmail() {
        return this.cliente.getEmail();
    }

    @Override
    public void setEmail(String email) {
        this.cliente.setEmail(email);
    }

    @Override
    public String getCelular() {
        return this.cliente.getCelular();
    }

    @Override
    public void setCelular(String celular) {
        this.cliente.setCelular(celular);
    }
}
