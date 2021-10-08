package metodo.fabrica;

public class MetodoFabrica {

    public static void main(String[] args) {
        Formato formato;
        formato = FabricaFormato.gerarFormato("jpeg");
        formato.gera();
        
        formato = FabricaFormato.gerarFormato("png");
        formato.gera();

        formato = FabricaFormato.gerarFormato("gif");
        formato.gera();

        formato = FabricaFormato.gerarFormato("bmp");
        formato.gera();
    }
}

