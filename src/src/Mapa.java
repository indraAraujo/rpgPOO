
package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mapa extends JFrame implements ActionListener {
    Protagonista protagonista;
    public Mapa() {
        initComponents();
        nivel1.addActionListener(this);
        nivel2.addActionListener(this);
        nivel3.addActionListener(this);
        nivel4.addActionListener(this);
        loja.addActionListener(this);

    }
    
    public void setMapa(Protagonista protagonista){
      this.protagonista=protagonista;  
    }
    
    public void actionPerformed(ActionEvent event){
        JButton clicked = (JButton) event.getSource();
        if(clicked==nivel1){
            Batalha nivelUm = new Batalha();
            nivelUm.setNivel(5, protagonista, new Vilao("Vilao 1"));
            nivelUm.setVisible(true);
            this.dispose();
        }else if(clicked==nivel2){
            Batalha nivelDois = new Batalha();
            nivelDois.setNivel(6, protagonista, new Vilao("Vilao 2"));
            nivelDois.setVisible(true);
            this.dispose();
        }else if(clicked==nivel3){
            Batalha nivelTres = new Batalha();
            nivelTres.setNivel(7, protagonista, new Vilao("Vilao 3"));
            nivelTres.setVisible(true);
            this.dispose();
        }else if(clicked==nivel4){
            Batalha nivelQuatro = new Batalha();
            nivelQuatro.setNivel(8, protagonista, new Vilao("Vilao 4"));
            nivelQuatro.setVisible(true);
            this.dispose();
        }else if(clicked==loja){
            LojaUI loja = new LojaUI();
            loja.setLoja(protagonista);
            loja.setVisible(true);
            this.dispose();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nivel1 = new javax.swing.JButton();
        nivel2 = new javax.swing.JButton();
        nivel3 = new javax.swing.JButton();
        nivel4 = new javax.swing.JButton();
        loja = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(2, 2, 39));

        nivel1.setText("Nivel 1");
        nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel1ActionPerformed(evt);
            }
        });

        nivel2.setText("Nivel 2");

        nivel3.setText("Nivel 3");

        nivel4.setText("Nivel 4");

        loja.setText("Loja");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(nivel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(nivel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nivel3)
                    .addComponent(nivel2))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loja)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nivel3)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(nivel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)))
                .addComponent(nivel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel1)
                .addGap(43, 43, 43)
                .addComponent(loja)
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

    private void nivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivel1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loja;
    private javax.swing.JButton nivel1;
    private javax.swing.JButton nivel2;
    private javax.swing.JButton nivel3;
    private javax.swing.JButton nivel4;
    // End of variables declaration//GEN-END:variables
}
