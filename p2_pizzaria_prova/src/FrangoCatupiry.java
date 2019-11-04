/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */

public class FrangoCatupiry extends PizzaFrango{
// TODO
    
    public FrangoCatupiry(String tam) {
        super(tam);
    }
    
    @Override
    public String getNome() {
        return nome;
    }
        @Override
    public void montarPizza(){
        ingredientes.add("Frango");
        ingredientes.add("Catupiry");
    };
       
    @Override
    public double getPreco() {
        return preco;
    }
    
    
    String nome = "Frago Catupiry";
    double preco = 28;
    
}