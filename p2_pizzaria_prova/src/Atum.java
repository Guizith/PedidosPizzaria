/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Atum extends Pizza{
    // TODO
    
    @Override
    public String getNome() {
        return nome;
    }
    
    
    public Atum(String tam) {
        super(tam);
    }
    
    @Override
    public void montarPizza(){
        ingredientes.add("Atum");
    };
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    String nome = "Atum";
    double preco = 30;
    
 
}
