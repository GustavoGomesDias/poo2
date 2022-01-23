package strategy;

import java.awt.image.BufferedImageOp;

public abstract class Strategy {
    protected float[] dimensions;

    public Strategy(float[] dimensions) {
        this.dimensions = dimensions;
    }

    public abstract BufferedImageOp returnConversionStrategy();
}
