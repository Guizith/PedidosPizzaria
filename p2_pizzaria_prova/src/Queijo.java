/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Queijo extends Pizza{
    // TODO 
    public Queijo(String tam) {
        super(tam);
    }
       

    @Override
    public String getNome() {
        return nome;
    }
   
    @Override
    public void montarPizza(){
        ingredientes.add("Queijo Provolone");
        ingredientes.add("Queijo Mussarela");
    };
    @Override
    public double getPreco() {
        return preco;
    }
    
    String nome = "Queijo";
    double preco = 25;
    
}
