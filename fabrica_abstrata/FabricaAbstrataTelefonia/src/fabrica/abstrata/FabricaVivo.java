/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

/**
 *
 * @author felipe
 */
public class FabricaVivo extends FabricaAbstrataEnvios{ 

    @Override
    public  Cobranca criaCobranca() {
        return new CobrancaVivo();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSVivo(); 
    }
}

