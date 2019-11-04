/**
 * P2 Orientação a Objetos
 * @author perico
 * @version 1.0
 */
                                                             
public  class PizzaFrango extends Pizza {
    // TODO
    public PizzaFrango(String tamanho) {
        super(tamanho);
    }
    
    @Override
    public void montarPizza(){
        ingredientes.add("Frango");
    };

    @Override
    public String getNome() {
        return nome;
    }
    
    String nome = "Frango";
}
