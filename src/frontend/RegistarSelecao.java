
package frontend;

import backend.Selecao;
import backend.Sistema;


public class RegistarSelecao extends javax.swing.JFrame {
    private Sistema sistema;
    
    public RegistarSelecao(Sistema sistema) {
        this.sistema=sistema;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        responsavel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(51, 151, 74, 41);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Registar Seleção");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 30, 292, 75);

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(332, 151, 75, 41);
        jPanel1.add(nome);
        nome.setBounds(411, 161, 64, 20);

        jLabel4.setText("Responsavel:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(131, 292, 66, 29);
        jPanel1.add(responsavel);
        responsavel.setBounds(207, 296, 93, 20);

        jButton1.setText("Registar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(131, 354, 108, 50);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(332, 354, 111, 50);
        jPanel1.add(codigo);
        codigo.setBounds(131, 161, 66, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             String cod=codigo.getText();
             String name=nome.getText();
             String resp=responsavel.getText();
             Selecao s1= new Selecao(cod,name,resp);
             sistema.adicionarSelecao(s1);
             VerSelecoes se= new VerSelecoes(sistema);
             se.setVisible(true);
             this.dispose();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VerSelecoes s1= new VerSelecoes(sistema);
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField responsavel;
    // End of variables declaration//GEN-END:variables
}
