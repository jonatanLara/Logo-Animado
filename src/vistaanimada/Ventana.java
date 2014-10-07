/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistaanimada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author jonatanLara
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    private Timer t;
    private ActionListener al;
   
    public Ventana() {
        initComponents();
        inicarProgreso();
        if (!t.isRunning()) {
            t.start();
        }
        
    }
    public void inicarProgreso(){
        al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jProgressBar1.getValue()<100) {
                    jProgressBar1.setValue(jProgressBar1.getValue()+1);
                   animacionDeHoja();
                   animacionHoja2();
                    animacionHoja3();
                }else{
                    t.stop();
                   // jProgressBar1.setValue(-100);//para que remueva lo pintado 
                }
             }
        };
           t = new  Timer(100,al);
    
    }
    public void animacionDeHoja(){
        //recupero las posiciones del label
    int x = hoja1.getX();
    int y = hoja1.getY();
    int x2 = hoja2.getX();
    int y2 = hoja2.getY();
    int x3 = hoja3.getX();
    int y3 = hoja3.getY();
    int x4= hoja4.getX();
    int y4 = hoja4.getY();
    int x5 = hoja5.getX();
    int y5 = hoja5.getY();
    int x6 = hoja6.getX();
    int y6 = hoja6.getY();
    int x7 = hoja7.getX();
    int y7 = hoja7.getY();
    int x16 = jLabel8.getX();
    int y16= jLabel8.getY();
    int x17 = jLabel9.getX();
    int y17 = jLabel9.getY();
    int x19=jLabel10.getX();
    int y19 = jLabel10.getY();
    
    int y29 = jLabel19.getY();
    int x29= jLabel19.getX();
    
    
    
    y+=5;
    x+=1;
    y2 +=5;
    x2 +=1;
    y3 +=5;
    x3 -=1;
    y4 +=5;
    x4 +=0;
    y5 +=5;
    x5 -=1;
    y6 +=5;
    x6 -=1;
    y7 +=5;
    x7 -=1;
 
    y16 += 4;
    x16 +=0;
    y17 += 3;
    x17+=0;
    y19 += 4;
    x19 +=0;
   
    y29 += 4;
    x29 +=0;
   
   
    
    
    
    int detener_x = suelo.getX();
    int detener_y = suelo.getY();
        
       // System.out.println("x"+x);
           if ( y+hoja1.getWidth()>=detener_y+34 & 
                y2+hoja2.getWidth()>=detener_y+34 & 
                y3+hoja3.getWidth()>=detener_y+34 &
                y4+hoja4.getWidth()>=detener_y+34 &
                y5+hoja5.getWidth()>=detener_y+34 &
                y6+hoja6.getWidth()>=detener_y+34 & 
                y7+hoja7.getWidth()>=detener_y+34 & 
                y7+hoja7.getWidth()>=detener_y+34 ){
               
                  
            y=detener_y+34-hoja1.getWidth();
            y2=detener_y+34-hoja2.getWidth();
            y3=detener_y+34-hoja3.getWidth();
            y4=detener_y+34-hoja4.getWidth();
            y5=detener_y+34-hoja5.getWidth();
            y6=detener_y+34-hoja6.getWidth();
            y7=detener_y+34-hoja7.getWidth();
           
           }
           if (    
                
                y16+jLabel8.getWidth()>=detener_y+34 &
                y17+jLabel9.getWidth()>=detener_y+34 ){
            
                
                y16=detener_y+34-jLabel8.getWidth();
                y17=detener_y+34-jLabel9.getWidth();
                y19=detener_y+34-jLabel10.getWidth();
            
           
 
   jLabel8.setLocation(x16,y16);
   jLabel9.setLocation(x17,y17);
   jLabel10.setLocation(x19,y19);
   
   jLabel19.setLocation(x29,y29);
        }
    
    //recupero la ubicacion y la renvieo
    hoja1.setLocation(x, y);
    hoja2.setLocation(x2, y2);
    hoja3.setLocation(x3, y3);
    hoja4.setLocation(x4, y4);
    hoja5.setLocation(x5, y5);
    hoja6.setLocation(x6, y6);
    hoja7.setLocation(x7, y7);
  
   jLabel8.setLocation(x16,y16);
   jLabel9.setLocation(x17,y17);
   jLabel10.setLocation(x19,y19);
  
   jLabel19.setLocation(x29,y29);
   
       System.out.println("x"
               +x+"-"+"y"+y);
    
    }
    public void animacionHoja2(){
    int x9 = jLabel1.getX();
    int y9= jLabel1.getY();
    int x10 = jLabel2.getX();
    int y10 = jLabel2.getY();
    int x11=jLabel3.getX();
    int y11 = jLabel3.getY();
    int x12= jLabel4.getX();
    int y12 = jLabel4.getY();
    int x13 = jLabel5.getX();
    int y13 = jLabel5.getY();
    int x14 = jLabel6.getX();
    int y14 = jLabel6.getY();
    int x15 = jLabel7.getX();
    int y15 = jLabel7.getY();
                               
    y9 +=4;
    x9 -=1;
    y10 += 4;
    x10 -=1;
    y11 += 4;
    x11 -=1;
    y12 += 4;
    x12 +=1;
    y13 += 4;
    x13 +=1;
    y14 += 4;
    x14 +=1;
    y15 += 4;
    x15 +=1;
    int detener_x = suelo.getX();
    int detener_y = suelo.getY();
    
     if (    
                y9+jLabel1.getWidth()>=detener_y+34 &
                y10+jLabel2.getWidth()>=detener_y+34 &
                y11+jLabel3.getWidth()>=detener_y+34 &
                y12+jLabel4.getWidth()>=detener_y+34 &
                y13+jLabel5.getWidth()>=detener_y+34 &
                y14+jLabel6.getWidth()>=detener_y+34 &
                y15+jLabel7.getWidth()>=detener_y+34 ){
           
            
                y9=detener_y+34-jLabel1.getWidth();
                y10=detener_y+34-jLabel2.getWidth();
                y11=detener_y+34-jLabel3.getWidth();
                y12=detener_y+34-jLabel4.getWidth();
                y13=detener_y+34-jLabel5.getWidth();
                y14=detener_y+34-jLabel6.getWidth();
                y15=detener_y+34-jLabel7.getWidth();
              
   jLabel1.setLocation(x9,y9);
   jLabel2.setLocation(x10,y10);
   jLabel3.setLocation(x11,y11);
   jLabel4.setLocation(x12,y12);
   jLabel5.setLocation(x13,y13);
   jLabel6.setLocation(x14,y14);
   jLabel7.setLocation(x15,y15);
 
        }
    
    jLabel1.setLocation(x9,y9);
   jLabel2.setLocation(x10,y10);
   jLabel3.setLocation(x11,y11);
   jLabel4.setLocation(x12,y12);
   jLabel5.setLocation(x13,y13);
   jLabel6.setLocation(x14,y14);
   jLabel7.setLocation(x15,y15);
 
    
    }
    public void animacionHoja3(){
    
    int x20= jLabel11.getX();
    int y20 = jLabel11.getY();
    int x21 = jLabel12.getX();
    int y21 = jLabel12.getY();
    int x22 = jLabel13.getX();
    int y22 = jLabel13.getY();
    int x23 = jLabel14.getX();
    int y23 = jLabel14.getY();
    int y24 = jLabel15.getY();
    int x24= jLabel15.getX();
    int y25 = jLabel16.getY();
    int x25 = jLabel16.getX();
    int y26 = jLabel17.getY();
    int x26 = jLabel17.getX();
    int y27 = jLabel18.getY();
    int x27 = jLabel18.getX();
    
    
    y20 += 5;
    x20 +=0;
    y21 += 5;
    x21 +=0;
    y22 +=5;
    x22 -=1;
    y23 +=5;
    x23 +=0;
    y24 += 5;
    x24 -=1;
    y25 += 5;
    x25 =1;
    y26 += 5;
    x26 -=1;
    y27 += 5;
    x27 -=1;
     int detener_x = suelo.getX();
    int detener_y = suelo.getY();
    
                         if (    
                
                y20+jLabel11.getWidth()>=detener_y+34 &
                y21+jLabel12.getWidth()>=detener_y+34 & y22+jLabel13.getWidth()>=detener_y+34 &
                y23+jLabel14.getWidth()>=detener_y+34 & y24+jLabel15.getWidth()>=detener_y+34 &
                y25+jLabel16.getWidth()>=detener_y+34 & y26+jLabel17.getWidth()>=detener_y+34 &
                y27+jLabel18.getWidth()>=detener_y+34 ){
            
                y20=detener_y+34-jLabel11.getWidth();
                y21=detener_y+34-jLabel12.getWidth();
                y22=detener_y+34-jLabel13.getWidth();
                y23=detener_y+34-jLabel14.getWidth();
                y24=detener_y+34-jLabel15.getWidth();
                y25 = detener_y+34-jLabel16.getWidth();
                y26 = detener_y+34-jLabel17.getWidth();
                y27 = detener_y+34-jLabel18.getWidth();
            
        
   jLabel11.setLocation(x20,y20);
   jLabel12.setLocation(x21,y21);
   jLabel13.setLocation(x22,y22);
   jLabel14.setLocation(x23,y23);
   jLabel15.setLocation(x24,y24); 
   jLabel16.setLocation(x25,y25);
   jLabel17.setLocation(x26,y26);
   jLabel18.setLocation(x27,y27);
        }
   jLabel11.setLocation(x20,y20);
   jLabel12.setLocation(x21,y21);
   jLabel13.setLocation(x22,y22);
   jLabel14.setLocation(x23,y23);
   jLabel15.setLocation(x24,y24); 
   jLabel16.setLocation(x25,y25);
   jLabel17.setLocation(x26,y26);
   jLabel18.setLocation(x27,y27);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hoja1 = new javax.swing.JLabel();
        hoja2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        hoja3 = new javax.swing.JLabel();
        hoja4 = new javax.swing.JLabel();
        hoja5 = new javax.swing.JLabel();
        hoja6 = new javax.swing.JLabel();
        hoja7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        suelo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hoja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(hoja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        hoja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(hoja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jProgressBar1.setForeground(new java.awt.Color(51, 153, 0));
        jProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jProgressBar1StateChanged(evt);
            }
        });
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 20));

        hoja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(hoja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        hoja4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(hoja4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        hoja5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(hoja5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        hoja6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(hoja6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        hoja7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(hoja7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, -10, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));
        getContentPane().add(suelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf3.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf2.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/leaf1.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistaanimada/5.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jProgressBar1StateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jProgressBar1StateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel hoja1;
    private javax.swing.JLabel hoja2;
    private javax.swing.JLabel hoja3;
    private javax.swing.JLabel hoja4;
    private javax.swing.JLabel hoja5;
    private javax.swing.JLabel hoja6;
    private javax.swing.JLabel hoja7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel suelo;
    // End of variables declaration//GEN-END:variables
}
