/**
 * P2 Orientação a Objetos
 *
 * @author perico
 * @version 1.0
 */
import java.util.ArrayList;

public class ListaPedidos extends javax.swing.JFrame {

    ListaPedidos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("Histórico de todos os pedidos");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exibeTodos(ArrayList<Pedido> pedidos) {
        // TODO
        for (int i = 0; i < pedidos.size(); i++) {
            jTextArea1.append(((i+1) +"- Nome :" + pedidos.get(i).getCliente().getNome())+ " \n");
            for (int j = 0; j < pedidos.get(i).pizzas.size(); j++) {
                jTextArea1.append("Pizza: " + pedidos.get(i).pizzas.get(j).getNome());
                jTextArea1.append("    T:" + pedidos.get(i).pizzas.get(j).getTamanho());
                jTextArea1.append("    RS:" + pedidos.get(i).pizzas.get(j).getPreco() +  " \n");

            }
            jTextArea1.append("\n \n ");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
