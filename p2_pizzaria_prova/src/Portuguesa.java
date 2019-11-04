/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */
                                                                                        
public class Portuguesa extends Pizza{
    // TODO

    public Portuguesa(String tam) {
        super(tam);
    }
    @Override
    public void montarPizza(){
        
        ingredientes.add("Palmito");
        ingredientes.add("Ovo");
        ingredientes.add("Presunto");
        ingredientes.add("Queijo");
        ingredientes.add("Ervilha");
    };
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    String nome = "Portuguesa";
    double preco = 25;
            
}
