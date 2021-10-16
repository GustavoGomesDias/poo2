package fabrica.abstrata.botoes;

import javax.swing.*;

public class FabricaBotoesIcones extends FabricaAbstrataBotoes {
    @Override
    public JButton criaBotaoOK() {
        JButton ok = new ButtonOK();
        ok.setText("OK");
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new ButtonCancel();
        return cancel;
    }
}
