import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Usuario usuario = new Usuario("Gustavo");
    Usuario userResposta = new Usuario("Leonardo");

    Mensagem msg = new Mensagem(usuario, "Hoje é sexta?");

    msg.addRespostas(userResposta, "Não");
    FileOutputStream fos = new FileOutputStream("src/temp.o");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(msg);
    oos.flush();
    oos.close();

    FileInputStream fIn = new FileInputStream("src/temp.o");
    ObjectInputStream oIn = new ObjectInputStream(fIn);
    Mensagem msgS = (Mensagem) oIn.readObject();

    System.out.println("Usuário: " + msgS.getUser().getNome());
    System.out.println("Mensagem: " + msgS.getTexto());
    for (Mensagem m : msgS.getRespostas()) {
      System.out.println("Mensagem (resposta): " + m.getTexto());
      System.out.println("Usuário (resposta): " + m.getUser().getNome());
    }
  }

}
