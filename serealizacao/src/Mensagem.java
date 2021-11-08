import java.io.Serializable;
import java.util.ArrayList;

public class Mensagem implements Serializable {
  private String texto;
  public Usuario user;
  public ArrayList<Mensagem> respostas = new ArrayList<Mensagem>();

  public Mensagem (Usuario user, String texto) {
    this.user = user;
    this.texto = texto;
  }

  public void addRespostas(Usuario user, String texto) {
    Mensagem resposta = new Mensagem(user, texto);
    respostas.add(resposta);
  }

  public Usuario getUser() { return this.user; }
  public String getTexto() { return this.texto; }
  public ArrayList<Mensagem> getRespostas() { return this.respostas; }
}
