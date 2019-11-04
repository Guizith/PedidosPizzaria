/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class Calabresa extends Pizza {
    // TODO
    public Calabresa(String tam) {
        super(tam);
    }
 
    @Override
    public String getNome() {
        return nome;
    }
    
    
    @Override
    public void montarPizza(){
        ingredientes.add("Calabresa");
        ingredientes.add("Cebola");
        
    };
    @Override
    public double getPreco() {
        return preco;
    }
    
    
    String nome = "Calabresa";
    double preco = 25;

}
