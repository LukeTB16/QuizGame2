/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static sun.misc.PostVMInitHook.run;
/**
 *
 * @author lucai
 */
/* Cose da sistemare:
   -bottone "next" deve segnare le risposte sbagliate 
   -inserire bottone "previous" per tornare indietro
   
*/
public class Quiz extends javax.swing.JFrame {

    /**
     * Creates new form Quiz
     */

    public Quiz(){
        initComponents();
        this.setLocationRelativeTo(null);
        next.setBackground(java.awt.Color.cyan);
        questionario = new Questionario();
        try {
            scan = new Scanner(new File("Domande.txt"));
            
            int n_domande = Integer.parseInt(scan.nextLine());
            System.out.println("Numero domande: "+n_domande);
            d_left=n_domande;
            for (int i = 0; i < n_domande; i++)
            {
                Domanda d=new Domanda();
                String a;
                a = scan.nextLine();
                //System.out.println(a);
                d.setDomanda(a);
                for (int j = 0; j < 4; j++){
                    a = scan.nextLine();
                    d.addRisposta(a);
                }
                
                int corretta = Integer.parseInt(scan.nextLine());
                //System.out.println("corretta = " + corretta);
                d.setCorretta(corretta);
                questionario.addDomanda(d);
                questionario.mescola();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File inesistente");
        }
        
        Domanda d=questionario.getDomanda(domanda_corrente);
        D1.setText(d.getDomanda());
        R0.setText(d.getRisposta(0));
        R1.setText(d.getRisposta(1));
        R2.setText(d.getRisposta(2));
        R3.setText(d.getRisposta(3));
        }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        R3 = new javax.swing.JButton();
        R2 = new javax.swing.JButton();
        R1 = new javax.swing.JButton();
        R0 = new javax.swing.JButton();
        wbox = new javax.swing.JLabel();
        rbox = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        D1 = new javax.swing.JLabel();
        endline = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        R3.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        R3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R3MousePressed(evt);
            }
        });
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });
        getContentPane().add(R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 230, 86));

        R2.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        R2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R2MousePressed(evt);
            }
        });
        getContentPane().add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 86));

        R1.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        R1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R1MousePressed(evt);
            }
        });
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });
        getContentPane().add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 230, 86));

        R0.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        R0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R0MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                R0MousePressed(evt);
            }
        });
        R0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0ActionPerformed(evt);
            }
        });
        getContentPane().add(R0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 86));

        wbox.setFont(new java.awt.Font("Yet R", 1, 14)); // NOI18N
        wbox.setText("False: 0");
        getContentPane().add(wbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 30));

        rbox.setFont(new java.awt.Font("Yet R", 1, 14)); // NOI18N
        rbox.setText("Right: 0");
        getContentPane().add(rbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Source Code Pro Black", 1, 14)); // NOI18N
        next.setText("NEXT >");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        D1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        D1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                D1MouseWheelMoved(evt);
            }
        });
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });
        D1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                D1KeyPressed(evt);
            }
        });
        getContentPane().add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 510, 200));

        endline.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(endline, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 464, 550, 40));

        background.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizgame2/background.jpg"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(546, 490));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });
        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R0MouseClicked
        
    }//GEN-LAST:event_R0MouseClicked
        
    private void R0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0ActionPerformed

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1ActionPerformed

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
     
    }//GEN-LAST:event_R3ActionPerformed

    private void R3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R3MouseClicked
        
    }//GEN-LAST:event_R3MouseClicked

    private void R2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R2MouseClicked
       
    }//GEN-LAST:event_R2MouseClicked

    private void R1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R1MouseClicked
   
    }//GEN-LAST:event_R1MouseClicked

    private void D1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_D1MouseWheelMoved

    }//GEN-LAST:event_D1MouseWheelMoved

    private void backgroundKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backgroundKeyPressed
        
    }//GEN-LAST:event_backgroundKeyPressed

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
        /*    
        if (flag == false)
                return;
            
            Domanda d=questionario.getDomanda(domanda_corrente);   
            
            ImageIcon back = new ImageIcon(getClass().getResource("background.jpg"));
            background.setIcon(back);
            D1.setVisible(true);
            R0.setVisible(true);
            R1.setVisible(true);
            R2.setVisible(true);
            R3.setVisible(true);
            
            D1.setText(d.getDomanda());
            R0.setText(d.getRisposta(0));
            R1.setText(d.getRisposta(1));
            R2.setText(d.getRisposta(2));
            R3.setText(d.getRisposta(3));
            if(domanda_corrente>=9 && giuste>=6){
                D1.setVisible(false);
                R0.setVisible(false);
                R1.setVisible(false);
                R2.setVisible(false);
                R3.setVisible(false);
                ImageIcon end = new ImageIcon(getClass().getResource("WIN1.gif"));
                background.setIcon(end);
                endline.setText("COMPLIMENTI !!! HAI OTTENUTO UN PUNTEGGIO DI " +giuste+"/10" );
            }
            else if(domanda_corrente>=9 && giuste<6){
                D1.setVisible(false);
                R0.setVisible(false);
                R1.setVisible(false);
                R2.setVisible(false);
                R3.setVisible(false);
                ImageIcon end = new ImageIcon(getClass().getResource("L1.gif"));
                background.setIcon(end);
            }*/
    }//GEN-LAST:event_backgroundMouseClicked

    private void D1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_D1KeyPressed
            
    }//GEN-LAST:event_D1KeyPressed

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        
    }//GEN-LAST:event_D1MouseClicked

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
            
    }//GEN-LAST:event_nextMouseClicked

    private void R0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R0MousePressed
        Domanda d=questionario.getDomanda(domanda_corrente);
        String g = Integer.toString(giusta);
        
        if(d.getCorretta()==0)
        {
            giusta++;
            rbox.setText("True: "+g);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("C1.gif"));
            background.setIcon(gif);
            
        }
        else{
            sbagliata++;
            String s = Integer.toString(sbagliata);
            wbox.setText("False: "+s);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("S2.gif"));
            background.setIcon(gif);
        
        }
    }//GEN-LAST:event_R0MousePressed

    private void R1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R1MousePressed
      Domanda d=questionario.getDomanda(domanda_corrente);
        
        if(d.getCorretta()==1)
        { 
            giusta++;
            String g = Integer.toString(giusta);
            rbox.setText("True: "+g);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("C4.gif"));
            background.setIcon(gif);
        
        }
        else{
            sbagliata++;
            String s = Integer.toString(sbagliata);
            wbox.setText("False: "+s);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("S1.gif"));
            background.setIcon(gif);
        }
    }//GEN-LAST:event_R1MousePressed

    private void R2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R2MousePressed
        Domanda d=questionario.getDomanda(domanda_corrente);
       
        if(d.getCorretta()==2)
        {
            giusta++;
            String g = Integer.toString(giusta);
            rbox.setText("True: "+g);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("C3.gif"));
            background.setIcon(gif);
            
        }
        
        else{
            sbagliata++;
            String s = Integer.toString(sbagliata);
            wbox.setText("False: "+s);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("S1.gif"));
            background.setIcon(gif);
        }
    }//GEN-LAST:event_R2MousePressed

    private void R3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R3MousePressed
        Domanda d=questionario.getDomanda(domanda_corrente);
        if(d.getCorretta()==3)
        {
            giusta++;
            String g = Integer.toString(giusta);
            rbox.setText("True: "+g);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("C2.gif"));
            background.setIcon(gif);
        }
        
        else{
            sbagliata++;
            String s = Integer.toString(sbagliata);
            wbox.setText("False: "+s);
            D1.setVisible(false);
            R0.setVisible(false);
            R1.setVisible(false);
            R2.setVisible(false);
            R3.setVisible(false);
            ImageIcon gif = new ImageIcon(getClass().getResource("S2.gif"));
            background.setIcon(gif);
    }
    }//GEN-LAST:event_R3MousePressed

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
            Domanda d=questionario.getDomanda(domanda_corrente); 
            domanda_corrente++;
            d_left--; 
            
            // INCREMENTO VARAIBILE "FALSE" IN CASO DI SKIP DELLE DOMANDE
            if(R0.getModel().isPressed()==false && R1.getModel().isPressed()==false && R2.getModel().isPressed()==false && R3.getModel().isPressed()==false && next.getModel().isPressed()==true){
                sbagliata++;
                String s = Integer.toString(sbagliata);
                wbox.setText("False: "+s);
            }
            
           
            // VITTORIA
            
            if(d_left==0 && giusta>=6){
                D1.setVisible(false);
                R0.setVisible(false);
                R1.setVisible(false);
                R2.setVisible(false);
                R3.setVisible(false);
                ImageIcon end = new ImageIcon(getClass().getResource("WIN1.gif"));
                background.setIcon(end);
                endline.setText("COMPLIMENTI !!! HAI OTTENUTO UN PUNTEGGIO DI " +giusta+"/10" );
            }
            
            // PERDITA
            else if(d_left==0 && giusta<6){
                D1.setVisible(false);
                R0.setVisible(false);
                R1.setVisible(false);
                R2.setVisible(false);
                R3.setVisible(false);
                ImageIcon end = new ImageIcon(getClass().getResource("L1.gif"));
                background.setIcon(end);
                endline.setText("HAI FALLITO, HAI OTTENUTO UN PUNTEGGIO DI " +giusta+"/10" );
            }
            
            // SCHERMATA DI GIOCO
            else if(d_left>0){ 
                ImageIcon back = new ImageIcon(getClass().getResource("background.jpg"));
                background.setIcon(back);
                D1.setVisible(true);
                R0.setVisible(true);
                R1.setVisible(true);
                R2.setVisible(true);
                R3.setVisible(true);
            
                D1.setText(d.getDomanda());
                R0.setText(d.getRisposta(0));
                R1.setText(d.getRisposta(1));
                R2.setText(d.getRisposta(2));
                R3.setText(d.getRisposta(3));
                
            }
            
            else{
                dispose();
            } 
    }//GEN-LAST:event_nextMousePressed
                
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /*
                
        File file = new File("Domande.txt");
        String domanda=file.getAbsolutePath();
        try{
            FileReader reader=new FileReader(domanda);
            BufferedReader br=new BufferedReader(reader);
            jLabel1.setText(domanda);       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }

        */
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
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
                
            }
            
        });
        
    }
    //private boolean flag = false;
    private int d_left=0;
    private int giusta=0;
    private int sbagliata=0;
    private Scanner scan;
    private Questionario questionario;
    private int domanda_corrente=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D1;
    private javax.swing.JButton R0;
    private javax.swing.JButton R1;
    private javax.swing.JButton R2;
    private javax.swing.JButton R3;
    private javax.swing.JLabel background;
    private javax.swing.JLabel endline;
    private javax.swing.JButton next;
    private javax.swing.JLabel rbox;
    private javax.swing.JLabel wbox;
    // End of variables declaration//GEN-END:variables

}
