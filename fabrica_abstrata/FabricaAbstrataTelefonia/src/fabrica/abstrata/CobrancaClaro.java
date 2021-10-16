package fabrica.abstrata;

public class CobrancaClaro implements Cobranca {

    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via claro");
    }
}
