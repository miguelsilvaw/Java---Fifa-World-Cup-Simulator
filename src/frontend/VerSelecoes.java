

package frontend;

import backend.Selecao;
import backend.Sistema;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VerSelecoes extends javax.swing.JFrame {
    public Sistema sistema;
    private DefaultTableModel modelo;
    
    public VerSelecoes(Sistema sistema) {
        this.sistema=sistema;
        initComponents();
        desenhaTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        voltarM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 204, 255));
        panel1.setLayout(null);

        voltarM.setText("Voltar");
        voltarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarMActionPerformed(evt);
            }
        });
        panel1.add(voltarM);
        voltarM.setBounds(520, 500, 73, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 452, 560);

        jButton1.setText("Nova ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(510, 130, 90, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarMActionPerformed
        // TODO add your handling code here:
        Menu menu= new Menu(sistema);
        menu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_voltarMActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       RegistarSelecao s1= new RegistarSelecao(sistema);
       s1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     private void desenhaTabela(){
         //Criação tabela
    try{
        java.util.List <Selecao> a = sistema.listarSelecoes();
        String colunas[] = {"ID","nome"};
        Object linhas[][]= new String[a.size()][2];
        int i=0;
        Selecao s1;
        for( int j=0;j<a.size();j++){
            s1=(Selecao)a.get(j);
            linhas[i][0]= s1.getCódigoSelecao();
            linhas[i][1]= s1.getNomeSelecao();
            
            i++;
            
        }
   modelo = new DefaultTableModel(linhas, colunas);
   

        jTable1.setModel(modelo);

        this.jTable1 = new JTable(linhas, colunas);
        this.jTable1.setVisible(true);
        jScrollPane1.setViewportView(jTable1);
        ((JComponent)this.getContentPane()).revalidate();
    }catch (Exception e) 
      {JOptionPane.showMessageDialog(this, "Não foi possível listar as seleçoes");}
 
 }


 
 
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton voltarM;
    // End of variables declaration//GEN-END:variables
}
