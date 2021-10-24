/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refeicao;

/**
 *
 * @author felip
 */
public class Suco extends Bebida {
         
    
    public Suco(String sabor){
        System.out.println("cria suco com sabor:" + sabor);
        this.setSabor(sabor);
    }
    
}
