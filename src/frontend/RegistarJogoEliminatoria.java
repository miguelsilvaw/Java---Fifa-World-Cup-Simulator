

package frontend;

import backend.Grupo;
import backend.Selecao;
import backend.Sistema;
import java.util.ArrayList;

//Jogo fase eliminacao
public class RegistarJogoEliminatoria extends javax.swing.JFrame {
    private Sistema sistema;
    private ArrayList<Selecao> selecao;      
    private ArrayList<Grupo> grupos;   
    
    public RegistarJogoEliminatoria(Sistema sistema) {
        this.sistema=sistema;
        initComponents();
        selecao = sistema.getSelecoes();
        for(Selecao sel : selecao){
        s1.addItem(sel.getNomeSelecao());
        s2.addItem(sel.getNomeSelecao());
    }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s2 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        dataRealizacao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estadio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(571, 491));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Registar Jogo de Eliminatoria");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 30, 370, 58);

        jLabel3.setText("Selecao1:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 130, 80, 40);

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        getContentPane().add(s1);
        s1.setBounds(200, 130, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("vs");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 140, 30, 20);

        jLabel5.setText("Selecao2");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 140, 60, 20);

        getContentPane().add(s2);
        s2.setBounds(420, 130, 80, 30);

        jLabel6.setText("Data de Realização:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 190, 110, 30);
        getContentPane().add(dataRealizacao);
        dataRealizacao.setBounds(230, 190, 80, 30);

        jLabel7.setText("Estádio: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 260, 90, 20);
        getContentPane().add(estadio);
        estadio.setBounds(230, 250, 80, 30);

        jLabel8.setText("Hora:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(340, 250, 80, 20);
        getContentPane().add(hora);
        hora.setBounds(420, 250, 80, 30);

        jLabel10.setText("Resultado:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 190, 60, 20);
        getContentPane().add(resultado);
        resultado.setBounds(420, 190, 80, 30);

        jLabel11.setText("Cartoes amarelos:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(120, 330, 90, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(230, 320, 80, 30);

        jLabel12.setText("Cartoes Vermelhos:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 320, 100, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(430, 320, 70, 30);

        jButton1.setText("Registar");
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 390, 120, 60);

        jButton2.setText("Cancelar");
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 390, 120, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/futebol.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dataRealizacao;
    private javax.swing.JTextField estadio;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField resultado;
    private javax.swing.JComboBox s1;
    private javax.swing.JComboBox s2;
    // End of variables declaration//GEN-END:variables
}
