
package frontend;


import backend.Sistema;
import backend.Staff;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class VerStaff extends javax.swing.JFrame {
private Sistema sistema;
    private TableModel modelo;
    
    
    public VerStaff(Sistema sistema) {
        initComponents();
        this.sistema=sistema;
         desenhaTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(790, 500));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Função", "Organização"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 380, 500);

        jButton1.setText("Novo Staff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 120, 150, 60);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 360, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VerPessoas p1= new VerPessoas(sistema);
        p1.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistarStaff f1= new RegistarStaff(sistema);
        f1.setVisible(true);
        this.dispose();
        

    }//GEN-LAST:event_jButton1ActionPerformed

 private void desenhaTabela(){
     // Criaçao de tabela
        try{
            List b=sistema.listaStaff();
            String colunas[]={"Nome","funçao"};
            Object linhas[][]= new String[b.size()][2];
            int i=0;
            Staff sf;
            for(int j=0; j<b.size();j++){
                sf=(Staff) b.get(j);
                linhas[i][0]=sf.getNome();
                linhas[i][1]=sf.getFuncao();
                i++;
            }
     modelo = new DefaultTableModel(linhas, colunas);

        jTable1.setModel(modelo);

        this.jTable1 = new JTable(linhas, colunas);
        this.jTable1.setVisible(true);
        jScrollPane1.setViewportView(jTable1);
        ((JComponent)this.getContentPane()).revalidate();
    }catch (Exception e) 
      {JOptionPane.showMessageDialog(this, "Não foi possível listar os membros do Staff");}
 }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
