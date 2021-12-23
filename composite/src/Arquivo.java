public class Arquivo extends ArquivoAbstract{

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override

    public ArquivoAbstract getArquivo(int index) {
        return this;
    }
}
