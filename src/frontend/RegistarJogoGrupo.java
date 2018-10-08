

package frontend;

import backend.Grupo;
import backend.Jogo;
import backend.Selecao;
import backend.Sistema;
import java.util.ArrayList;


public class RegistarJogoGrupo extends javax.swing.JFrame {
private Sistema sistema;
private ArrayList<Selecao> selecao;      
private ArrayList<Grupo> grupos;    
public RegistarJogoGrupo(Sistema sistema) {
        //Adicionar selecoes ao grupo.
        this.sistema= sistema;
        initComponents();
        selecao = sistema.getSelecoes();
        for(Selecao sel : selecao){
            s1.addItem(sel.getNomeSelecao());
            s2.addItem(sel.getNomeSelecao());
        }
       grupos = sistema.getGrupos();
       for(Grupo gr1: grupos){
           g1.addItem(gr1.getIDGrupo());
       }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        s2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        estadio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        g1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        amarelos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        vermelhos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        arbitro = new javax.swing.JTextField();
        dataRealizacao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(502, 500));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setText("Selecao1:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(13, 150, 66, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Registar Jogo de Grupo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(83, 51, 279, 29);

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        jPanel1.add(s1);
        s1.setBounds(83, 155, 70, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("vs");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(179, 151, 17, 22);

        jLabel4.setText("Selecao2");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(214, 158, 43, 14);

        jPanel1.add(s2);
        s2.setBounds(286, 155, 109, 20);

        jLabel5.setText("Data de Realização:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(214, 202, 96, 14);

        jLabel7.setText("Estádio: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 257, 42, 14);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(633, 31, 0, 0);
        jPanel1.add(estadio);
        estadio.setBounds(83, 254, 70, 20);

        jLabel8.setText("Hora:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(214, 251, 42, 26);
        jPanel1.add(hora);
        hora.setBounds(260, 254, 50, 20);

        jLabel9.setText("Grupo:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 202, 33, 14);

        jPanel1.add(g1);
        g1.setBounds(83, 199, 70, 20);

        jLabel10.setText("Resultado:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 308, 52, 14);
        jPanel1.add(resultado);
        resultado.setBounds(83, 305, 70, 20);

        jLabel11.setText("Cartoes amarelos:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(214, 308, 88, 14);

        amarelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarelosActionPerformed(evt);
            }
        });
        jPanel1.add(amarelos);
        amarelos.setBounds(306, 305, 89, 20);

        jLabel12.setText("Cartoes Vermelhos:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 354, 94, 14);
        jPanel1.add(vermelhos);
        vermelhos.setBounds(114, 351, 39, 20);

        jButton1.setText("Registar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 407, 88, 42);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(214, 407, 75, 42);

        jLabel13.setText("Árbitro:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(214, 351, 55, 20);

        arbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbitroActionPerformed(evt);
            }
        });
        jPanel1.add(arbitro);
        arbitro.setBounds(306, 351, 89, 20);
        jPanel1.add(dataRealizacao);
        dataRealizacao.setBounds(320, 199, 75, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/futebol.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 630, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void amarelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amarelosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VerJogos j1= new VerJogos(sistema);
        j1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //Introduzir variaveis no frontend, bem como construtor e adição de jogo.
       String se1= (String) s1.getSelectedItem();
       String se2= (String) s2.getSelectedItem();
       String gr1= (String) g1.getSelectedItem();
       String data= dataRealizacao.getText();
       String hora1= hora.getText();
       String estad= estadio.getText();
       String result=resultado.getText();
       String arb=arbitro.getText();
       Integer amar= Integer.parseInt(amarelos.getText());
       Integer verm= Integer.parseInt(vermelhos.getText());
       Jogo jogo1= new Jogo();
       sistema.adicionarJogo(jogo1);
       VerJogos j1= new VerJogos(sistema);
       j1.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void arbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arbitroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amarelos;
    private javax.swing.JTextField arbitro;
    private javax.swing.JTextField dataRealizacao;
    private javax.swing.JTextField estadio;
    private javax.swing.JComboBox g1;
    private javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField resultado;
    private javax.swing.JComboBox s1;
    private javax.swing.JComboBox s2;
    private javax.swing.JTextField vermelhos;
    // End of variables declaration//GEN-END:variables
}
