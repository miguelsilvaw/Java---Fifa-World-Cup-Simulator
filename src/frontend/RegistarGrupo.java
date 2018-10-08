

package frontend;

import backend.Grupo;
import backend.Selecao;
import backend.Sistema;
import java.util.ArrayList;


//Registar grupo
public class RegistarGrupo extends javax.swing.JFrame {
private Sistema sistema;
private ArrayList<Selecao> selecao;
    
    public RegistarGrupo(Sistema sistema) {
        this.sistema= sistema;
        initComponents();
        
        //Registar selecao a um grupo
        selecao = sistema.getSelecoes();
        for(Selecao sel : selecao){
            s1.addItem(sel.getNomeSelecao());
            s2.addItem(sel.getNomeSelecao());
            s3.addItem(sel.getNomeSelecao());
            s4.addItem(sel.getNomeSelecao());
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ide = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s3 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        s4 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        s2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        s1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Registar Grupo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 10, 300, 80);

        jLabel2.setText("Identificação:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(28, 107, 91, 31);
        jPanel1.add(ide);
        ide.setBounds(123, 112, 88, 20);

        jLabel3.setText("Seleção1:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(28, 152, 66, 14);

        jLabel4.setText("Seleção2:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(249, 149, 64, 20);

        jLabel5.setText("Seleçao2:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(28, 213, 47, 23);

        jPanel1.add(s3);
        s3.setBounds(123, 214, 50, 20);

        jLabel6.setText("Seleção4:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(249, 213, 52, 23);

        jPanel1.add(s4);
        s4.setBounds(319, 214, 60, 20);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 360, 127, 60);

        jPanel1.add(s2);
        s2.setBounds(317, 149, 60, 20);

        jButton1.setText("Registar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(300, 360, 127, 60);

        s1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(s1);
        s1.setBounds(123, 149, 50, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String ide1=ide.getText();
       String se1=(String) s1.getSelectedItem();
       String se2=(String) s2.getSelectedItem();
       String se3=(String) s3.getSelectedItem();
       String se4=(String) s4.getSelectedItem();
       Grupo g1= new Grupo(ide1);
       sistema.adicionarGrupo(g1);
       VerGrupos g2= new VerGrupos(sistema);
       g2.setVisible(true);
       this.dispose();
       
           
           
           
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       VerGrupos g1= new VerGrupos(sistema);
       g1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox s1;
    private javax.swing.JComboBox s2;
    private javax.swing.JComboBox s3;
    private javax.swing.JComboBox s4;
    // End of variables declaration//GEN-END:variables
}
