
package src;

import exceptions.QuantidadeInsuficienteException;
import exceptions.SemDinheiroException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LojaUI extends JFrame implements ActionListener {
    Loja loja;
    Protagonista protagonista;
    public LojaUI() {
        initComponents();
        voltar.addActionListener(this);
        mochila_b.addActionListener(this);
    }

    public void setLoja(Protagonista protagonista, Loja loja){
        this.protagonista=protagonista;
        this.loja=loja;
        din_label.setText(String.valueOf(protagonista.getDinheiro()));
        ataqueProtagonista.setText(String.valueOf(protagonista.getAtaque()));
        defesaProtagonista.setText(String.valueOf(protagonista.getDefesa()));

    }
    public void atualizar(){
        din_label.setText(String.valueOf(protagonista.getDinheiro()));
        ataqueProtagonista.setText(String.valueOf(protagonista.getAtaque()));
        defesaProtagonista.setText(String.valueOf(protagonista.getDefesa()));
    }
        
    public void actionPerformed(ActionEvent event){
        JButton clicked = (JButton) event.getSource();
        if(clicked == voltar){
            Mapa mapa = new Mapa();
            mapa.setMapa(protagonista);
            mapa.repasseLoja(loja);
            mapa.setVisible(true);
            this.dispose();
        }else if(clicked==mochila_b){
            Mochila mochila = new Mochila();
            mochila.setMochila(protagonista);
            mochila.setVisible(true);
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        defesa = new javax.swing.JLabel();
        cura = new javax.swing.JLabel();
        ataque = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        din_label = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        mochila_b = new javax.swing.JButton();
        ataqueProtagonista = new javax.swing.JLabel();
        defesaProtagonista = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(2, 2, 39));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Market");

        defesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medical-insurance.png"))); // NOI18N
        defesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarDefesa(evt);
            }
        });

        cura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medicine.png"))); // NOI18N
        cura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarCura(evt);
            }
        });

        ataque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fist.png"))); // NOI18N
        ataque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprarAtaque(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ataque  $2,50");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Defesa  $3,75");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cura  $4,00");

        din_label.setForeground(new java.awt.Color(255, 255, 255));
        din_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dollar.png"))); // NOI18N

        voltar.setBackground(new java.awt.Color(2, 2, 39));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/undo.png"))); // NOI18N

        mochila_b.setBackground(new java.awt.Color(2, 2, 39));
        mochila_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backpack (1).png"))); // NOI18N

        ataqueProtagonista.setForeground(new java.awt.Color(255, 255, 255));
        ataqueProtagonista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fist (1).png"))); // NOI18N

        defesaProtagonista.setForeground(new java.awt.Color(255, 255, 255));
        defesaProtagonista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medical-insurance P.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(din_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ataqueProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ataque)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(defesa)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel1)
                            .addComponent(cura)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel7))
                            .addComponent(defesaProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mochila_b)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ataque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(defesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ataqueProtagonista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(din_label)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)
                                .addComponent(mochila_b))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(defesaProtagonista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprarAtaque(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarAtaque
        try{
                protagonista.comprarAtaque(loja.comprarProduto("ATAQUE"));
                atualizar();
            }catch(SemDinheiroException de){
                de.printStackTrace();
            }
    }//GEN-LAST:event_comprarAtaque

    private void comprarDefesa(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarDefesa
         try{
                protagonista.comprarDefesa(loja.comprarProduto("DEFESA"));
                atualizar();
            }catch(SemDinheiroException de){
                de.printStackTrace();
            }
    }//GEN-LAST:event_comprarDefesa

    private void comprarCura(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprarCura
         try{
                protagonista.comprarCura(loja.comprarProduto("CURA"));
                atualizar();
            }catch(SemDinheiroException de){
                de.printStackTrace();
            }
    }//GEN-LAST:event_comprarCura

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LojaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ataque;
    private javax.swing.JLabel ataqueProtagonista;
    private javax.swing.JLabel cura;
    private javax.swing.JLabel defesa;
    private javax.swing.JLabel defesaProtagonista;
    private javax.swing.JLabel din_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mochila_b;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
