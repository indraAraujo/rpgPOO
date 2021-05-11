
package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Mapa extends JFrame implements ActionListener {
    Protagonista protagonista;
    Loja lojaClasse;
    public Mapa() {
        initComponents();
        nivel1.addActionListener(this);
        nivel2.addActionListener(this);
        nivel3.addActionListener(this);
        nivel4.addActionListener(this);
        loja.addActionListener(this);
        mochila_b.addActionListener(this);

    }
    public void repasseLoja(Loja loja){
        this.lojaClasse=loja;
    }
    public void setMapa(Protagonista protagonista){
      this.protagonista=protagonista;  
      nome_label.setText(protagonista.getNome());
      din_label.setText(String.valueOf(protagonista.getDinheiro()));
       setVida();
    }
    public void setVida(){
        switch(protagonista.getVida()){
            case 1:
                vidaProtagonista.setText("*");
                break;
            case 2:
                vidaProtagonista.setText("* *");
                break;
            case 3:
                vidaProtagonista.setText("* * *");
                break;
            case 4:
                vidaProtagonista.setText("* * * *");
                break;
            case 5:
                vidaProtagonista.setText("* * * * *");
                break;
        }
    }
    
    public void actionPerformed(ActionEvent event){
        JButton clicked = (JButton) event.getSource();
        if(clicked==nivel1){
            Batalha nivelUm = new Batalha();
            nivelUm.setNivel(5, protagonista, new Vilao("Vilao 1"), lojaClasse);
            nivelUm.setVisible(true);
            this.dispose();
        }else if(clicked==nivel2){
            Batalha nivelDois = new Batalha();
            nivelDois.setNivel(6, protagonista, new Vilao("Vilao 2"), lojaClasse);
            nivelDois.setVisible(true);
            this.dispose();
        }else if(clicked==nivel3){
            Batalha nivelTres = new Batalha();
            nivelTres.setNivel(7, protagonista, new Vilao("Vilao 3"), lojaClasse);
            nivelTres.setVisible(true);
            this.dispose();
        }else if(clicked==nivel4){
            Batalha nivelQuatro = new Batalha();
            nivelQuatro.setNivel(8, protagonista, new Vilao("Vilao 4"), lojaClasse);
            nivelQuatro.setVisible(true);
            this.dispose();
        }else if(clicked==loja){
            LojaUI loja = new LojaUI();
            loja.setLoja(protagonista, lojaClasse);
            loja.setVisible(true);
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
        nivel1 = new javax.swing.JButton();
        nivel2 = new javax.swing.JButton();
        nivel3 = new javax.swing.JButton();
        nivel4 = new javax.swing.JButton();
        loja = new javax.swing.JButton();
        mochila_b = new javax.swing.JButton();
        din_label = new javax.swing.JLabel();
        nome_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vidaProtagonista = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("MAPA");

        jPanel1.setBackground(new java.awt.Color(2, 2, 39));
        jPanel1.setToolTipText("");

        nivel1.setBackground(new java.awt.Color(255, 255, 255));
        nivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pngegg (6).png"))); // NOI18N
        nivel1.setText("Nivel 1");
        nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel1ActionPerformed(evt);
            }
        });

        nivel2.setBackground(new java.awt.Color(255, 255, 255));
        nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pngegg (6).png"))); // NOI18N
        nivel2.setText("Nivel 2");
        nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivel2ActionPerformed(evt);
            }
        });

        nivel3.setBackground(new java.awt.Color(255, 255, 255));
        nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pngegg (6).png"))); // NOI18N
        nivel3.setText("Nivel 3");

        nivel4.setBackground(new java.awt.Color(255, 255, 255));
        nivel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pngegg (6).png"))); // NOI18N
        nivel4.setText("Nivel 4");

        loja.setBackground(new java.awt.Color(2, 2, 39));
        loja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/shop.png"))); // NOI18N

        mochila_b.setBackground(new java.awt.Color(2, 2, 39));
        mochila_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backpack (1).png"))); // NOI18N

        din_label.setForeground(new java.awt.Color(255, 255, 255));
        din_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dollar.png"))); // NOI18N

        nome_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nome_label.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rua.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/entrada.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dentro.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fim.jpg"))); // NOI18N

        vidaProtagonista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vidaProtagonista.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(nivel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mochila_b)
                .addGap(55, 55, 55)
                .addComponent(loja)
                .addGap(138, 138, 138))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vidaProtagonista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(129, 129, 129))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nivel3)
                        .addGap(240, 240, 240))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(nivel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)))
                        .addGap(173, 173, 173))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(nivel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(din_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(nome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addComponent(din_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(vidaProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel2)
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nivel1)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel4)
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivel3)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mochila_b)
                    .addComponent(loja))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivel1ActionPerformed

    private void nivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivel2ActionPerformed

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
    private javax.swing.JLabel din_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loja;
    private javax.swing.JButton mochila_b;
    private javax.swing.JButton nivel1;
    private javax.swing.JButton nivel2;
    private javax.swing.JButton nivel3;
    private javax.swing.JButton nivel4;
    private javax.swing.JLabel nome_label;
    private javax.swing.JLabel vidaProtagonista;
    // End of variables declaration//GEN-END:variables
}
