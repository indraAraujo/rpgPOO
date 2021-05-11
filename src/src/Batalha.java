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
        Loja loja;
    public Batalha() {
        initComponents();
        
        curar_button.addActionListener(this);
        ataqueS_button.addActionListener(this);
        ataqueC_button.addActionListener(this);
    } 

   public void setNivel(int nivel, Protagonista protagonista, Vilao vilao, Loja loja) {
    	this.numeroNivel=nivel;
    	this.protagonista = protagonista;
    	this.vilao = vilao;
        this.nivel = new Nivel(protagonista, vilao);
        this.loja=loja;
        setVida();
        nomeVilao.setText(vilao.getNome());
        nomeProtagonista.setText(protagonista.getNome());
        
    }
    
    public void checarVida(){
        if(protagonista.getVida()<=0){
            JOptionPane.showMessageDialog(null, "GAME OVER");
            protagonista.reset();
            Mapa mapa = new Mapa();
            mapa.setMapa(protagonista);
            mapa.repasseLoja(loja);
            mapa.setVisible(true);
            this.dispose();
        }else{
            vilaoMorto();
            setVida();
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
                protagonista.setDinheiro(protagonista.getDinheiro()+3.00);
                PosBatalha pos = new PosBatalha();
                pos.setPos(protagonista, numeroNivel, loja);
                pos.setVisible(true); 
                this.dispose();
            }
            
        }
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
        switch(vilao.getVida()){
            case 1:
                vidaVilao.setText("*");
                break;
            case 2:
                vidaVilao.setText("* *");
                break;
            case 3:
                vidaVilao.setText("* * *");
                break;
            case 4:
                vidaVilao.setText("* * * *");
                break;
            case 5:
                vidaVilao.setText("* * * * *");
                break;
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
        }else if (clicked==ataqueC_button){
            int dano=nivel.getNivel(numeroNivel);//define o intervalo para o número aleatório
            nivel.getVilao().levarDano(nivel.getProtagonista().ataquesimples(dano*2));//protagonista ataca -> gera dano -> vilao leva dano
            vidaVilao.setText(String.valueOf(nivel.getVilao().getVida()));//atualiza vida do vilao
            nivel.getProtagonista().levarDano(nivel.getVilao().getAtaque());//vilao ataca -> gera dano -> protagonista leva dano
            vidaProtagonista.setText(String.valueOf(nivel.getProtagonista().getVida()));//atualiza vido do protagonista
            checarVida();
        }else if(clicked==curar_button){
            try{
                protagonista.usarCura();
            }catch(VidaCheiaException ve){
                JOptionPane.showMessageDialog(null, "Sua vida está cheia, não precisa de cura!");
            }catch(SemProdutoException se){
                JOptionPane.showMessageDialog(null, "Você não tem cura na sua mochila!");
            }
            setVida();
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
        nomeVilao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeProtagonista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 2, 39));

        ataqueS_button.setBackground(new java.awt.Color(2, 2, 39));
        ataqueS_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fist (1).png"))); // NOI18N

        ataqueC_button.setBackground(new java.awt.Color(153, 0, 0));
        ataqueC_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fist (1).png"))); // NOI18N

        vidaProtagonista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vidaProtagonista.setForeground(new java.awt.Color(255, 255, 255));

        vidaVilao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        vidaVilao.setForeground(new java.awt.Color(255, 255, 255));

        curar_button.setBackground(new java.awt.Color(2, 2, 39));
        curar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/medicine (1).png"))); // NOI18N

        nomeVilao.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heart.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heart.png"))); // NOI18N

        nomeProtagonista.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ataqueC_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(10, 10, 10)
                                        .addComponent(vidaProtagonista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(curar_button)
                                        .addGap(65, 65, 65)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vidaVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(nomeVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ataqueS_button)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vidaProtagonista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vidaVilao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(curar_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(ataqueC_button)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addComponent(ataqueS_button)
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeProtagonista;
    private javax.swing.JLabel nomeVilao;
    private javax.swing.JLabel vidaProtagonista;
    private javax.swing.JLabel vidaVilao;
    // End of variables declaration//GEN-END:variables
}
