
package telecom.desk.authorization;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.geom.FlatteningPathIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import telecom.desk.mainFrames.mainFrame;


public class authorization extends javax.swing.JFrame {


    public boolean vis = false;
    
    public registration reg;
    
    public authorization() {
        initComponents();
        //setLocation((getX() * 2) - (getWidth() / 2), getY());
        initElements();
        setBackground(new Color(0,0,0,0));
        //this.mainPanel.setBackground(new Color(0,0,0,0));
        this.mainPanel.setBackground(new Color(255, 255, 255));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new telecom.desk.swing.LPanel();
        lPanelTriangle1 = new telecom.desk.swing.LPanelTriangle();
        lButton3 = new telecom.desk.swing.LButton();
        lTextField1 = new telecom.desk.swing.LTextField();
        lTextField2 = new telecom.desk.swing.LTextField();
        lButton4 = new telecom.desk.swing.LButton();
        lButton5 = new telecom.desk.swing.LButton();
        jLabel1 = new javax.swing.JLabel();
        lPanelTriangle2 = new telecom.desk.swing.LPanelTriangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 650));
        setUndecorated(true);

        mainPanel.setBorderAdd(true);
        mainPanel.setMaximumSize(new java.awt.Dimension(350, 650));
        mainPanel.setMinimumSize(new java.awt.Dimension(350, 650));
        mainPanel.setPreferredSize(new java.awt.Dimension(350, 650));
        mainPanel.setShadowAdd(true);
        mainPanel.setShadowColor(new java.awt.Color(0, 0, 153));
        mainPanel.setShadowGap(7);
        mainPanel.setShadowOffset(6);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lPanelTriangle1.setBorderColor(new java.awt.Color(204, 204, 204));
        lPanelTriangle1.setBorderOpacity(100);
        lPanelTriangle1.setBorderSize(10);
        lPanelTriangle1.setCustomCoordinateOn(true);
        lPanelTriangle1.setCustomCoordinateX2(330);
        lPanelTriangle1.setCustomCoordinateY1(6);
        lPanelTriangle1.setCustomCoordinateY2(330);
        lPanelTriangle1.setCustomCoordinateY3(630);
        lPanelTriangle1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lPanelTriangle1MouseDragged(evt);
            }
        });
        lPanelTriangle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lPanelTriangle1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lPanelTriangle1MouseReleased(evt);
            }
        });

        lButton3.setBackground(new java.awt.Color(0, 0, 153));
        lButton3.setForeground(new java.awt.Color(255, 255, 255));
        lButton3.setText("SIGN IN");
        lButton3.setBorderAdd(true);
        lButton3.setBorderColor(new java.awt.Color(204, 204, 204));
        lButton3.setCircleEffectAdd(true);
        lButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lButton3MouseClicked(evt);
            }
        });

        lTextField1.setText("Number");
        lTextField1.setBorderAdd(true);

        lTextField2.setText("Password");
        lTextField2.setBorderAdd(true);

        lButton4.setBackground(new java.awt.Color(0, 0, 153));
        lButton4.setForeground(new java.awt.Color(255, 255, 255));
        lButton4.setText("ВОЙТИ");
        lButton4.setBorderAdd(true);
        lButton4.setBorderColor(new java.awt.Color(204, 204, 204));
        lButton4.setCircleEffectAdd(true);
        lButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButton4ActionPerformed(evt);
            }
        });

        lButton5.setBackground(new java.awt.Color(0, 0, 153));
        lButton5.setForeground(new java.awt.Color(255, 255, 255));
        lButton5.setText("ВЫЙТИ");
        lButton5.setBorderAdd(true);
        lButton5.setBorderColor(new java.awt.Color(204, 204, 204));
        lButton5.setCircleEffectAdd(true);
        lButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButton5ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logo.png"))); // NOI18N

        javax.swing.GroupLayout lPanelTriangle1Layout = new javax.swing.GroupLayout(lPanelTriangle1);
        lPanelTriangle1.setLayout(lPanelTriangle1Layout);
        lPanelTriangle1Layout.setHorizontalGroup(
            lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanelTriangle1Layout.createSequentialGroup()
                .addGroup(lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lPanelTriangle1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lPanelTriangle1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(lPanelTriangle1Layout.createSequentialGroup()
                                .addGroup(lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(lButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(lButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        lPanelTriangle1Layout.setVerticalGroup(
            lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanelTriangle1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(lTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lPanelTriangle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );

        mainPanel.add(lPanelTriangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 660));

        lPanelTriangle2.setBorderAdd(false);
        lPanelTriangle2.setCustomCoordinateOn(true);
        lPanelTriangle2.setCustomCoordinateX2(300);
        lPanelTriangle2.setCustomCoordinateY2(300);
        lPanelTriangle2.setCustomCoordinateY3(600);
        lPanelTriangle2.setGradientAdd(true);
        lPanelTriangle2.setGradientEndColor(new java.awt.Color(102, 153, 255));
        lPanelTriangle2.setGradientFocus(600);
        lPanelTriangle2.setGradientStartColor(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout lPanelTriangle2Layout = new javax.swing.GroupLayout(lPanelTriangle2);
        lPanelTriangle2.setLayout(lPanelTriangle2Layout);
        lPanelTriangle2Layout.setHorizontalGroup(
            lPanelTriangle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        lPanelTriangle2Layout.setVerticalGroup(
            lPanelTriangle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        mainPanel.add(lPanelTriangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 220, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lButton3MouseClicked
       if (reg == null) {
           reg = new registration();
           reg.setVisible(true);
       }  else{
           reg.setVisible(true);
       }
    }//GEN-LAST:event_lButton3MouseClicked

    private void lButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButton4ActionPerformed
        new mainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_lButton4ActionPerformed

    private void lButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_lButton5ActionPerformed

    int locationX;
    int locationY;
    
    private void lPanelTriangle1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPanelTriangle1MousePressed
        locationX =  evt.getX();
        locationY = evt.getY();
    }//GEN-LAST:event_lPanelTriangle1MousePressed

    private void lPanelTriangle1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPanelTriangle1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - locationX, y - locationY);
        this.setOpacity(0.86f);
    }//GEN-LAST:event_lPanelTriangle1MouseDragged

    private void lPanelTriangle1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lPanelTriangle1MouseReleased
        this.setOpacity(1f);
    }//GEN-LAST:event_lPanelTriangle1MouseReleased

    int xLocation;
    int yLocation;
    
    public static void main(String args[]) {

//        try {
//            UIManager.setLookAndFeel(new FlatIntelliJLaf());
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(authorization.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new authorization().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private telecom.desk.swing.LButton lButton3;
    private telecom.desk.swing.LButton lButton4;
    private telecom.desk.swing.LButton lButton5;
    private telecom.desk.swing.LPanelTriangle lPanelTriangle1;
    private telecom.desk.swing.LPanelTriangle lPanelTriangle2;
    private telecom.desk.swing.LTextField lTextField1;
    private telecom.desk.swing.LTextField lTextField2;
    private telecom.desk.swing.LPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    public void initElements () {
//        field1.text.addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                initIconClear(1);
//            }
//        });
        
//        field1.text.addKeyListener(new java.awt.event.KeyAdapter() {
//            @Override
//            public void keyPressed(java.awt.event.KeyEvent evt) {
//                initIconClear(1);
//                field1.background_color.setBackground(new Color(0,102,255));
//            }
//            
//            @Override
//            public void keyReleased (java.awt.event.KeyEvent evt) {
//                field1.background_color.setBackground(new Color(153,153,255));
//            }
//        });
//        
//        field2.text.addFocusListener(new java.awt.event.FocusAdapter() {
//            public void focusLost(java.awt.event.FocusEvent evt) {
//                initIconClear(0);
//            }
//        });
//        
//        field1.text.addFocusListener(new java.awt.event.FocusAdapter() {
//            public void focusLost(java.awt.event.FocusEvent evt) {
//                initIconClear(0);
//            }
//        });
    }
    
    
    public void initIconClear(int i) {
        
//        if (i == 0) {
//            field1.icon_clear.setVisible(false);
//            field2.icon_clear.setVisible(false);
//            field1.icon_clear.setVisible(false);
//            field1.icon_clear.setVisible(false);
//            field1.icon_clear.setVisible(false);  
//        }
//        
//        switch (i) {
//            case 1 -> field1.icon_clear.setVisible(true);
//            case 2 -> field2.icon_clear.setVisible(true);
//            case 3 -> field1.icon_clear.setVisible(true);
//            case 4 -> field1.icon_clear.setVisible(true);
//            case 5 -> field1.icon_clear.setVisible(true);
//        }
    }

}
