

package refeicao;

/**
 *
 * @author felip
 */
public class NonVegetarianoBuilder extends RefeicaoBuilder{
 
    public NonVegetarianoBuilder(Refeicao novaRefeicao){
        this.refeicao = novaRefeicao;
    }    
    public void prepadaHamburgerCarne(){
        System.out.println("cria hamburger carne");
        this.refeicao.setHamburger(new HamburgerCarne());                
    }        
}
