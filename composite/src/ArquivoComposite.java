import java.util.ArrayList;

public class ArquivoComposite extends ArquivoAbstract{
    public ArrayList<ArquivoAbstract> listaDeArquivos = new ArrayList<>();

    public ArquivoComposite(String nome) {
        this.nome = nome;
    }

    @Override
    public void printNomeDoArquivo() {
        super.printNomeDoArquivo();
    }

    @Override
    public void adicionarArquivo(ArquivoAbstract novoArquivo) {
        this.listaDeArquivos.add(novoArquivo);
    }

    @Override
    public void removerArquivo(int index) {
        this.listaDeArquivos.remove(index);
    }

    @Override
    public ArquivoAbstract getArquivo(int index) {
        return this.listaDeArquivos.get(index);
    }
}
