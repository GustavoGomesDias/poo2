package strategy;

import java.awt.image.BufferedImageOp;

public class ChangeImage {
    private final Strategy strategy;

    public ChangeImage(Strategy strategy) {
        this.strategy = strategy;
    }

    public BufferedImageOp returnConversion() {
        return this.strategy.returnConversionStrategy();
    }
}
