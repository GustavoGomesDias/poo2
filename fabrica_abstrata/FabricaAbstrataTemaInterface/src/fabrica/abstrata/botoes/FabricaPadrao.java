package fabrica.abstrata.botoes;

import javax.swing.*;

public class FabricaPadrao extends FabricaAbstrataBotoes {

    @Override
    public JButton criaBotaoOK() {
        JButton ok = new JButton();
        ok.setText("OK");
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new JButton();
        cancel.setText("Cancel");
        return cancel;
    }
}
