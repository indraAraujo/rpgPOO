/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.OverlayLayout;
import src.Nivel;
import src.Protagonista;
import src.Vilao;


public class SetUp extends JFrame implements ActionListener{
    Nivel nivelUm= new Nivel(new Protagonista("Pessoa", 2),new Vilao("Do Mal", 1));
   
    public SetUp() {
        defesa_b.addActionListener(this);
        poder_b.addActionListener(this);
        curar_b.addActionListener(this);
        ataqueS_b.addActionListener(this);
       
    }
    
    public void actionPerformed (ActionEvent event){
        Random rand = new Random();
        JButton clicked = (JButton) event.getSource();
        if(clicked==ataqueS_b){
            int dano=nivelUm.getNivel(4);
            nivelUm.getVilao().levarDano(nivelUm.getProtagonista().ataquesimples(dano));
            vidaVilao.setText(nivelUm.getVilao().getVida());
            nivelUm.getProtagonista().levarDano(nivelUm.getVilao().getAtaque(dano));
            vidaProtago.setText(nivelUm.getProtagonista().getVida());
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        poder_b = new javax.swing.JButton();
        defesa_b = new javax.swing.JButton();
        ataqueS_b = new javax.swing.JButton();
        curar_b = new javax.swing.JButton();
        ataqueC_b = new javax.swing.JButton();
        vidaProtago = new javax.swing.JLabel();
        vidaVilao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(3, 10, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/destroyedCityTown.jpg"))); // NOI18N

        poder_b.setBackground(new java.awt.Color(255, 255, 255));
        poder_b.setText("Poder");

        defesa_b.setBackground(new java.awt.Color(92, 67, 8));
        defesa_b.setText("Defesa");

        ataqueS_b.setBackground(new java.awt.Color(0, 30, 198));
        ataqueS_b.setText("Ataque Simples");

        curar_b.setBackground(new java.awt.Color(102, 255, 102));
        curar_b.setText("Curar");

        ataqueC_b.setText("Ataque Combo");

        vidaProtago.setForeground(new java.awt.Color(255, 255, 255));

        vidaVilao.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(vidaProtago, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vidaVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ataqueS_b)
                            .addComponent(defesa_b))
                        .addGap(18, 18, 18)
                        .addComponent(ataqueC_b)
                        .addContainerGap(288, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(poder_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(curar_b))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vidaVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vidaProtago, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(defesa_b)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poder_b)
                    .addComponent(curar_b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ataqueS_b)
                    .addComponent(ataqueC_b)))
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

    public static void main(String args[]) {
        SetUp frame = new SetUp();
        frame.setLocationRelativeTo(null);
		frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataqueC_b;
    private javax.swing.JButton ataqueS_b;
    private javax.swing.JButton curar_b;
    private javax.swing.JButton defesa_b;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton poder_b;
    private javax.swing.JLabel vidaProtago;
    private javax.swing.JLabel vidaVilao;
    // End of variables declaration//GEN-END:variables
}
