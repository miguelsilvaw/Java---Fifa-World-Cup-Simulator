

package frontend;

import backend.Jogo;
import backend.Sistema;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VerJogos extends javax.swing.JFrame {
private Sistema sistema;
    private DefaultTableModel modelo;
   
    
    public VerJogos(Sistema sistema) {
        this.sistema=sistema;
        initComponents();
        tabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jButton1.setText("Novo Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(472, 42, 162, 73);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SeleçãoA", "SeleçãoB", "Resultado", "Estádio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 410, 500);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 390, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      RegistarJogoGrupo jog1= new RegistarJogoGrupo(sistema);
      jog1.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     Menu m1= new Menu(sistema);
     m1.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   private void tabela(){
       //Criação de tabela
       try{
           List a = sistema.getJogos();
        String colunas[] = {"S1","VS","S2","Resultado"};
        Object linhas[][] = new String[a.size()][];
        int i=0;
        Jogo j1;
        for (int j=0;j<a.size();j++){
            j1 = (Jogo) a.get(j);
            linhas[i][0]= j1.getSelecaoA();
            linhas[i][1]= "vs";
            linhas[i][2]= j1.getSelecaoB();
            linhas[i][3]= j1.getResultadoFinalJogo();
            i++;
        }
        
        modelo = new DefaultTableModel(linhas, colunas);

        jTable1.setModel(modelo);

        this.jTable1 = new JTable(linhas, colunas);
        this.jTable1.setVisible(true);
        jScrollPane1.setViewportView(jTable1);
        ((JComponent)this.getContentPane()).revalidate();
    }catch (Exception e) 
      {JOptionPane.showMessageDialog(this, "Não foi possível listar os jogos");}
 }
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
