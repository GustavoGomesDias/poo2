public abstract class ArquivoAbstract {
    protected String nome;

    public void printNomeDoArquivo() {
        System.out.println(this.nome);
    }

    public void adicionarArquivo(ArquivoAbstract novoArquivo) {
        System.out.println("Não é permitido adicionar arquivos");
    }

    public void removerArquivo(int index) {
        System.out.println("Não é permitido remover arquivos");
    }

    public ArquivoAbstract getArquivo(int index) {
        return this;
    }
}
