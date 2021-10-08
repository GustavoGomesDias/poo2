package metodo.fabrica;

public class FabricaFormato {

    public static Formato gerarFormato(String formato) {
        Formato gerador = null;
        if (formato.equalsIgnoreCase("jpeg")) {
            gerador = new FormatoJpeg();
        } else if (formato.equalsIgnoreCase("png")) {
            gerador = new FormatoPng();
        } else if (formato.equalsIgnoreCase("gif")) {
            gerador = new FormatoGif();
        } else if (formato.equalsIgnoreCase("bmp")) {
            gerador = new FormatoBmp();
        }
        return gerador;
    }
}
