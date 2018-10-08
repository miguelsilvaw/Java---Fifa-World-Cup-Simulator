
package frontend;


import backend.Selecao;
import backend.Sistema;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VerGrupos extends javax.swing.JFrame {
  private Sistema sistema;
  
    private DefaultTableModel modelo;
    public VerGrupos(Sistema sistema) {
        this.sistema= sistema;
        initComponents();
        tabela();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "JR", "GM", "GS", "Pts"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 700, 150);

        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 370, 160, 60);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 430, 90, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBox1MouseReleased(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(30, 20, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RegistarGrupo gr1= new RegistarGrupo(sistema);
        gr1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu m1= new Menu(sistema);
     m1.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
        
    }//GEN-LAST:event_jComboBox1MousePressed

    private void jComboBox1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseReleased
       List a = sistema.getGrupos();
        String id=jComboBox1.getSelectedItem().toString();
        Selecao s;
        
        for(int j=0;j<a.size();j++){
            s= (Selecao) a.get(j);
            if(s.getCódigoSelecao().equals(id)){
               System.out.println(s.getNomeSelecao());
            }
        }
    }//GEN-LAST:event_jComboBox1MouseReleased
    private void tabela(){
        //Criação de tabela para guardar informação
        try{
        List a = sistema.getGrupos();
        String colunas[]={"ID","JR","GM","GS","DG","Pts"};
        Object linhas[][]= new String[a.size()][6];
        int i=0;
        Selecao s1;
        for(int j=0;j<a.size();j++){
            s1= (Selecao) a.get(j);
            linhas[i][0]=s1.getCódigoSelecao();
            linhas[i][1]=s1.getNumeroJogos()+ "";
            linhas[i][2]=s1.getGolosMarcados() + "";
            linhas[i][3]=s1.getGolosSofridos() + "";
            linhas[i][4]=s1.getDiferencaDeGolos() + "";
            linhas[i][5]=s1.getPontos() + "";
                       i++;
        }
         
        modelo = new DefaultTableModel(linhas, colunas);

        jTable1.setModel(modelo);

        this.jTable1 = new JTable(linhas, colunas);
        this.jTable1.setVisible(true);
        jScrollPane1.setViewportView(jTable1);
        ((JComponent)this.getContentPane()).revalidate();
    }catch (Exception e) 
      {JOptionPane.showMessageDialog(this, "Não foi possível listar os grupos");}
 
        
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
