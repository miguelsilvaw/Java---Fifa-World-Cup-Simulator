
package frontend;

import backend.Sistema;

//Classe de entrada
public class Home extends javax.swing.JFrame {
    public Sistema sistema;
   
    public Home(Sistema sistema) {
        this.sistema=sistema;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        start = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 380));
        getContentPane().setLayout(null);

        panel1.setMinimumSize(new java.awt.Dimension(800, 354));
        panel1.setLayout(null);

        start.setFont(new java.awt.Font("AngsanaUPC", 1, 36)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        panel1.add(start);
        start.setBounds(90, 190, 100, 40);

        sair.setFont(new java.awt.Font("AngsanaUPC", 1, 36)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        panel1.add(sair);
        sair.setBounds(200, 190, 100, 40);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banner-fifa-world-cup.jpg"))); // NOI18N
        panel1.add(imagem);
        imagem.setBounds(0, 0, 800, 360);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 800, 358);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        Menu menu= new Menu(sistema);
        menu.setVisible(true);
        this.dispose();
        
   
      
        
        
    }//GEN-LAST:event_startActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton sair;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
