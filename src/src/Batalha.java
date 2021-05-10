/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import exceptions.VidaCheiaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import src.exceptions.SemProdutoException;


public class Batalha extends JFrame implements ActionListener {
        int numeroNivel=0;
	Protagonista protagonista;
	Vilao vilao;
	Nivel nivel;
    public Batalha() {
        initComponents();
        
        curar_button.addActionListener(this);
        ataqueS_button.addActionListener(this);
        ataqueC_button.addActionListener(this);
    }

   public void setNivel(int nivel, Protagonista protagonista, Vilao vilao) {
    	this.numeroNivel=nivel;
    	this.protagonista = protagonista;
    	this.vilao = vilao;
        this.nivel = new Nivel(protagonista, vilao);
        vidaVilao.setText(String.valueOf(vilao.getVida()));//atualiza vida do vilao
        vidaProtagonista.setText(String.valueOf(protagonista.getVida()));
    }
    
    public void checarVida(){
        if(protagonista.getVida()<=0){
            JOptionPane.showMessageDialog(null, "GAME OVER");
            protagonista.reset();
            Mapa mapa = new Mapa();
            mapa.setMapa(protagonista);
            mapa.setVisible(true);
            this.dispose();
        }
    }
    
    public void vilaoMorto(){
        if(vilao.getVida()<=0){
            if(numeroNivel==4){
                Win fim = new Win();
                fim.setVisible(true);
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(null, "VOCÊ GANHOU A BATALHA");
                PosBatalha pos = new PosBatalha();
                pos.setPos(protagonista, numeroNivel);
                pos.setVisible(true); 
                this.dispose();
            }
            
        }
    }
    
    public void actionPerformed (ActionEvent event){
        JButton clicked = (JButton) event.getSource();
        if(clicked==ataqueS_button){
            int dano=nivel.getNivel(numeroNivel);//define o intervalo para o número aleatório
            nivel.getVilao().levarDano(protagonista.ataquesimples(dano));//protagonista ataca -> gera dano -> vilao leva dano
            vidaVilao.setText(String.valueOf(vilao.getVida()));//atualiza vida do vilao
            nivel.protagonista.levarDano(vilao.getAtaque());//vilao ataca -> gera dano -> protagonista leva dano
            vidaProtagonista.setText(String.valueOf(protagonista.getVida()));//atualiza vido do protagonista
            checarVida();
            vilaoMorto();
        }else if (clicked==ataqueC_button){
            int dano=nivel.getNivel(numeroNivel);//define o intervalo para o número aleatório
            nivel.getVilao().levarDano(nivel.getProtagonista().ataquesimples(dano*2));//protagonista ataca -> gera dano -> vilao leva dano
            vidaVilao.setText(String.valueOf(nivel.getVilao().getVida()));//atualiza vida do vilao
            nivel.getProtagonista().levarDano(nivel.getVilao().getAtaque());//vilao ataca -> gera dano -> protagonista leva dano
            vidaProtagonista.setText(String.valueOf(nivel.getProtagonista().getVida()));//atualiza vido do protagonista
            checarVida();
            vilaoMorto();
        }else if(clicked==curar_button){
            try{
                protagonista.usarCura();
            }catch(VidaCheiaException ve){
                JOptionPane.showMessageDialog(null, "Sua vida está cheia, não precisa de cura!");
            }catch(SemProdutoException se){
                JOptionPane.showMessageDialog(null, "Você não tem cura na sua mochila!");
            }
        }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ataqueS_button = new javax.swing.JButton();
        ataqueC_button = new javax.swing.JButton();
        vidaProtagonista = new javax.swing.JLabel();
        vidaVilao = new javax.swing.JLabel();
        curar_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 2, 39));

        ataqueS_button.setText("Atacar");

        ataqueC_button.setText("Combo");

        vidaProtagonista.setForeground(new java.awt.Color(255, 255, 255));

        vidaVilao.setForeground(new java.awt.Color(255, 255, 255));

        curar_button.setText("Curar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(vidaProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                            .addComponent(vidaVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(curar_button)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(ataqueS_button)
                                    .addGap(160, 160, 160)
                                    .addComponent(ataqueC_button)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vidaVilao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vidaProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(curar_button)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ataqueS_button, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(ataqueC_button)
                            .addGap(8, 8, 8)))
                    .addContainerGap()))
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
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataqueC_button;
    private javax.swing.JButton ataqueS_button;
    private javax.swing.JButton curar_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel vidaProtagonista;
    private javax.swing.JLabel vidaVilao;
    // End of variables declaration//GEN-END:variables
}
