/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public  class FrangoCheddar extends PizzaFrango{
    // TODO
    

 
    public FrangoCheddar(String tam) {
        super(tam);
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void montarPizza(){
        ingredientes.add("Frango");        
        ingredientes.add("Cheddar");
    };
    @Override
    public double getPreco() {
        return preco;
    }
    
    String nome = "FrangoCheddar";
    double preco = 30;
}
