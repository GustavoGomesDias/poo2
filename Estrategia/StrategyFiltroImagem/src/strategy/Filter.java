package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class Filter extends Strategy {

    public Filter(float[] dimensions) {
        super(dimensions);
    }

    @Override
    public BufferedImageOp returnConversionStrategy() {
        return new ConvolveOp(new Kernel(3, 3, this.dimensions), ConvolveOp.EDGE_NO_OP, null);
    }
}
