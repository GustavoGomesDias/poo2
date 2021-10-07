package metodo.fabrica;

public class FabricaFormato {

    public static Formato gerarFormato(String formato) {
        Formato gerador = null;
        if (formato.equalsIgnoreCase("jpeg")) {
            gerador = new FormatoJpeg();
        } else if (formato.equalsIgnoreCase("png")) {
            gerador = new FormatoPng();
        }
        return gerador;
    }
}
